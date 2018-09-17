package com.vz.spring.cloud.consumer.pojo;

import java.math.BigDecimal;

import lombok.Data;

/**
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-09-17 16:06:22
 */
@Data
public class User {

    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}
