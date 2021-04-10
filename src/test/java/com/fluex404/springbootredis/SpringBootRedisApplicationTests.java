package com.fluex404.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.ui.ModelMap;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class SpringBootRedisApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	void contextLoads() {

		/** hash **/
		HashOperations hashOperations = redisTemplate.opsForHash();

		/** save **/
//		ModelMap m = new ModelMap();
//		m.put("id", 102);
//		m.put("name", "Rara");
//
//		hashOperations.put("USER", m.get("id"), m);
//
//		ModelMap m2 = new ModelMap();
//		m2.put("id", 101);
//		m2.put("name", "Isa");
//
//		hashOperations.put("USER", m2.get("id"), m2);

		/** findall **/
//		Map user = hashOperations.entries("USER");
//		System.out.println(user);

		/** findById **/
//		Object user = hashOperations.get("USER", 101);
//		System.out.println(user);

		/** deletebyid **/
//		hashOperations.delete("USER", 102);

		/** redistemplate **/
//		Boolean exist = redisTemplate.hasKey("USER");
//		System.out.println(exist);

//		redisTemplate.opsForList().push

		/** keys **/
		Set keys = hashOperations.keys("USER");
		System.out.println(keys.toString());

		/** size **/
//		Long size = hashOperations.size("USER");
//		System.out.println(size);

		/** set expired **/
//		redisTemplate.expire("USER", 40, TimeUnit.SECONDS);

		/** get expired **/
//		Long expiredTime = redisTemplate.getExpire("USER");
//		System.out.println(expiredTime);
	}

}
