package com.ds.moon.dsproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ds.moon.dsproject.entity.UserHb;
import com.ds.moon.dsproject.entity.UserHbBridge;

@Repository
public interface UserHbRepository extends JpaRepository<UserHb, UserHbBridge>{
    
    List<UserHb> findAllByUserUserId(String userId);

    void deleteByUser(String userId);


}
