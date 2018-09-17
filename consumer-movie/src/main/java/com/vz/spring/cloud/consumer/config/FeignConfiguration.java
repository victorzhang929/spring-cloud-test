package com.vz.spring.cloud.consumer.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;

/**
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-09-17 19:58:11
 */
public class FeignConfiguration {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
