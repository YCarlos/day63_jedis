package com.carlos.jedis;

import com.carlos.utils.JedisUtils;
import redis.clients.jedis.Jedis;

/**
 * Created by IntelliJ IDEA.
 * User: Carlos
 * Date: 2019/8/14
 * Time: 11:33
 */
public class App {
    public static void main(String[] args) {
        //创建Jedis对象
        Jedis jedis = new Jedis("10.8.161.13", 6379);
        //如果没有在配置文件中设置密码，不用使用该方法
        //jedis.auth("redis的密码");
        //根据key值获取字符串类型内容
        //String name = jedis.get("name");

        //System.out.println(name);

        //设置值
        //jedis.set("hobby", "敲代码");
        //System.out.println(jedis.get("hobby"));

        // 获取hash结构中的value值
        //String name = jedis.hget("hh", "name");
        //System.out.println(name);



        // 关闭
        jedis.close();

        jedisPoolTest();
    }

    public static void jedisPoolTest() {
        Jedis jedis = JedisUtils.getJedis();
        System.out.println(jedis.get("age"));
        JedisUtils.closeJedis(jedis);

    }
}
