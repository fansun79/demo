package com.sun.demo.dao;

import com.sun.demo.entity.RoleUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleUserDao extends JpaRepository<RoleUser,Long> {
}
