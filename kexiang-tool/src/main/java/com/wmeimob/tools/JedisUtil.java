package com.wmeimob.tools;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCommands;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtil {
	
	public static void main(String[] args) {
		int s = (int)((Math.random() *9 +1)*100000);
		System.out.println(s);
		 
		 Jedis jedis = new Jedis("127.0.0.1", 6379, 2000);
	        System.out.println("连接成功");
	        
	        jedis.set("runoobkey", "www.runoob.com");
	        jedis.set("cc", "weeweew");
	        jedis.set("runoobkey", "w33");
	        
	        jedis = new Jedis("127.0.0.1", 6379, 2000);
	        // 获取存储的数据并输出
	        System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkey"));
	        
	        System.out.println("redis 存储的字符串为: "+ jedis.get("cc"));
	}
	
}

