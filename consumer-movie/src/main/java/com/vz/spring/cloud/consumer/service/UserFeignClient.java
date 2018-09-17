package com.vz.spring.cloud.consumer.service;

import com.vz.spring.cloud.consumer.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-09-17 19:53:04
 */
@FeignClient(name = "provider-user", fallbackFactory = UserFeignClientFallbackFactory.class)
public interface UserFeignClient {

    @GetMapping("/{id}")
    User findById(@PathVariable("id") Long id);
}
