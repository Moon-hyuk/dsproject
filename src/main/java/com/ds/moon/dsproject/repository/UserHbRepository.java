package com.ds.moon.dsproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.moon.dsproject.entity.UserHb;
import com.ds.moon.dsproject.entity.UserHbBridge;

public interface UserHbRepository extends JpaRepository<UserHb, UserHbBridge>{
    
}
