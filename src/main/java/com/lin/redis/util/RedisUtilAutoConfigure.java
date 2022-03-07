package com.lin.redis.util;

import com.lin.redis.util.RedisUtil;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

@Configuration
@ConditionalOnBean(StringRedisTemplate.class)
public class RedisUtilAutoConfigure {

    @Bean
    @ConditionalOnMissingBean(RedisUtil.class)
    public RedisUtil redisUtil(StringRedisTemplate StringRedisTemplate){
        return new RedisUtil(StringRedisTemplate);
    }
}
