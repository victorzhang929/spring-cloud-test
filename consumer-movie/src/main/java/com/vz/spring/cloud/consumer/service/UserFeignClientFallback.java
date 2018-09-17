package com.vz.spring.cloud.consumer.service;

import com.vz.spring.cloud.consumer.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-09-17 21:20:18
 */
@Component
public class UserFeignClientFallback implements UserFeignClient {
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("default user");
        return user;
    }
}
