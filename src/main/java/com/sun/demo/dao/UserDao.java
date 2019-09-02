package com.sun.demo.dao;


import com.sun.demo.entity.User;
import com.sun.demo.entity.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    @Query("SELECT U FROM User U ,RoleUser RU WHERE U.id = RU.userId AND RU.roleId = :roleId")
    List<User> findUsersByRole(@Param("roleId") Long roleId);


    @Query(value = "SELECT new com.sun.demo.entity.vo.UserVO(U.name,U.password,R.name) FROM User U ,RoleUser RU ,Role R WHERE U.id = RU.userId AND R.id = RU.roleId And RU.roleId = :roleId")
    List<UserVO> findUserVOsByRole(@Param("roleId") Long roleId);



}
