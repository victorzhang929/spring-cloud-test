package com.vz.spring.cloud.consumer.controller;

import java.util.List;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.vz.spring.cloud.consumer.pojo.User;
import com.vz.spring.cloud.consumer.service.UserFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-09-17 16:08:20
 */
@RestController
@Slf4j
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id) {
        return this.userFeignClient.findById(id);
    }

    @GetMapping("/instance")
    public List<ServiceInstance> listServiceInstance() {
        return this.discoveryClient.getInstances("provider-user");
    }

    @GetMapping("/user-instance")
    public void logUserInstance() {
        ServiceInstance instance = this.loadBalancerClient.choose("provider-user");
        log.info("{}:{}:{}", instance.getServiceId(), instance.getHost(), instance.getPort());
    }
}
