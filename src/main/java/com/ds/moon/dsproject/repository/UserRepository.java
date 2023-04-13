package com.ds.moon.dsproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.moon.dsproject.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
} 