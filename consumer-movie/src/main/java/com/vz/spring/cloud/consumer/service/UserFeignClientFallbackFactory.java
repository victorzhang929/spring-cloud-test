package com.vz.spring.cloud.consumer.service;

import com.vz.spring.cloud.consumer.pojo.User;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-09-17 21:07:21
 */
@Component
@Slf4j
public class UserFeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {

    @Override
    public UserFeignClient create(final Throwable throwable) {
        return new UserFeignClient() {
            @Override
            public User findById(Long id) {
                log.error("enter fallback method, exception: ", throwable);
                User user = new User();
                user.setId(id);
                user.setName("default user");
                return user;
            }
        };
    }
}
