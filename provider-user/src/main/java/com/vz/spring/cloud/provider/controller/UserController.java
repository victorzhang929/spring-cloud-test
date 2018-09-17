package com.vz.spring.cloud.provider.controller;

import com.vz.spring.cloud.provider.dao.UserRepository;
import com.vz.spring.cloud.provider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-09-17 15:50:12
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Long id) {
        return this.userRepository.findOne(id);
    }
}
