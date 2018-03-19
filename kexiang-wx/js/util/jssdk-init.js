/**
 * Created by Administrator on 2017/7/7.
 */


req.get("/jssdk?currentUrl="+encodeURI(location.href), function (ret) {
    if (ret.code == 0) {
        var appid = ret.data.appId;
        var timestamp = ret.data.timestamp;
        var nonceStr = ret.data.noncestr;
        var signature = ret.data.signature;
        wx.config({
            debug: false,
            appId: appid,
            timestamp: timestamp,
            nonceStr: nonceStr,
            signature: signature,
            jsApiList: [
                'chooseImage',//选择图片
                'previewImage',//预览图片
                'uploadImage',//上传图片
                'downloadImage',//下载图片
                'getLocalImgData',//获取本地图片
                'getLocation',//获取经纬度
                "openLocation",//打开地图
                'onMenuShareTimeline',//分享朋友圈
                'onMenuShareAppMessage',//分享app
                'onMenuShareQQ',//分享qq
                'onMenuShareWeibo',//分享微博
                'onMenuShareQZone',//分享QQ空间
                'scanQRCode',//微信扫一扫
                'chooseWXPay'   //唤起微信支付
            ]
        });
    }else{
        console.error(ret.msg)
    }
});
