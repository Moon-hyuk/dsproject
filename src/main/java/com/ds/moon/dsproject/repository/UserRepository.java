package com.ds.moon.dsproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ds.moon.dsproject.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    User findByuserId(String userId);

    User findByUserNm(String userNm);

    List<User> findByUserNmContaining(String searchKeyword);

    
    
} 