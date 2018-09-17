package com.vz.spring.cloud.provider.dao;

import com.vz.spring.cloud.provider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-09-17 15:49:21
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
