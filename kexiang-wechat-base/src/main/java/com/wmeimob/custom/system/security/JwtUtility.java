package com.wmeimob.custom.system.security;


import com.wmeimob.custom.wechat.entity.WechatUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtility implements Serializable {

    private static final long serialVersionUID = -3301605591108950415L;

    private static final String CLAIM_KEY_USERNAME = "user";
    private static final String CLAIM_KEY_CREATED = "created";



    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    @Value("${jwt.header}")
    private String header;

    public String getHeader() {
        return header;
    }

    public String getUsernameFromToken(String token) {
        String username;
        try {
            final Claims claims = getClaimsFromToken(token);
            username = claims.getSubject();
        } catch (Exception e) {
            username = null;
        }
        return username;
    }

    /**
     * 从token获取创建时间
     *
     * @param token
     * @return
     */
    private Date getCreatedDateFromToken(String token) {
        Date created;
        try {
            final Claims claims = getClaimsFromToken(token);
            created = new Date((Long) claims.get(CLAIM_KEY_CREATED));
        } catch (Exception e) {
            created = null;
        }
        return created;
    }

    /**
     * 从token获取过期时间
     *
     * @param token
     * @return
     */
    private Date getExpirationDateFromToken(String token) {
        Date expiration;
        try {
            final Claims claims = getClaimsFromToken(token);
            expiration = claims.getExpiration();
        } catch (Exception e) {
            expiration = null;
        }
        return expiration;
    }

    /**
     * 从token获取声明
     *
     * @param token
     * @return
     */
    private Claims getClaimsFromToken(String token) {
        Claims claims;
        try {
            claims = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            claims = null;
        }
        return claims;
    }

    /**
     * 产生过期时间
     *
     * @return
     */
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration * 1000);
    }

    /**
     * 判断token是否过期
     *
     * @param token
     * @return
     */
    private Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }


    /**
     * 根据userDetails创建token
     *
     * @return
     */
    public String generateToken(WechatUser wechatUser) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", wechatUser.getId());
        claims.put(CLAIM_KEY_USERNAME, wechatUser.getOpenid());
        claims.put(CLAIM_KEY_CREATED, new Date());
        claims.put("nickname",wechatUser.getNickname());
        claims.put("headimgurl",wechatUser.getHeadimgurl());
        claims.put("subscribe",wechatUser.getSubscribe());
        claims.put("appid",wechatUser.getAppid());
        return generateToken(claims);
    }

    /**
     * 根据map创建token
     *
     * @param claims
     * @return
     */
    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    public Boolean canTokenBeRefreshed(String token, Date lastPasswordReset) {
        final Date created = getCreatedDateFromToken(token);
        return !isTokenExpired(token);
    }

    /**
     * 刷新token
     *
     * @param token
     * @return
     */
    public String refreshToken(String token) {
        String refreshedToken;
        try {
            final Claims claims = getClaimsFromToken(token);
            claims.put(CLAIM_KEY_CREATED, new Date());
            refreshedToken = generateToken(claims);
        } catch (Exception e) {
            refreshedToken = null;
        }
        return refreshedToken;
    }

    /**
     * 根据userDetails和token验证token合法性
     *
     * @param token
     * @param userDetails
     * @return
     */
    public UserDetails validateToken(String token, UserDetails userDetails) {
        final String username = getUsernameFromToken(token);
//        final Date created = getCreatedDateFromToken(token);
//        final Date expiration = getExpirationDateFromToken(token);
        Boolean result = (
                username.equals(userDetails.getUsername())
                        && !isTokenExpired(token));
        if (result) {
            return userDetails;
        }
        return null;
    }


    /**
     * 解密token为UserDetails
     *
     * @param token
     * @return
     */
    public UserDetails decodeToken(String token) {
        Claims claims = getClaimsFromToken(token);
        if (claims == null || isTokenExpired(token))//token解密失败或token过期
            return null;

        String username = (String) claims.get(CLAIM_KEY_USERNAME);
        Integer id = (Integer) claims.get("id");
//        Integer mpid = (Integer) claims.get("mpid");
        String nickname = (String) claims.get("nickname");
        String appid = (String) claims.get("appid");
        String headimgurl = (String) claims.get("headimgurl");
        Boolean subscribe = (Boolean) claims.get("subscribe");

        //返回给spring security
        WechatUser wechatUser=new WechatUser();
        wechatUser.setId(id);
        wechatUser.setOpenid(username);
        wechatUser.setNickname(nickname);
        wechatUser.setHeadimgurl(headimgurl);
        wechatUser.setAppid(appid);
        wechatUser.setSubscribe(subscribe);
        return wechatUser;
    }

}