package com.ds.moon.dsproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ds.moon.dsproject.entity.UserHb;
import com.ds.moon.dsproject.entity.UserHbBridge;

@Repository
public interface UserHbRepository extends JpaRepository<UserHb, UserHbBridge>{
    
    List<UserHb> findAllByUserUserId(String userId);

    @Query(value = "delete from user_hb_tb t where t.user.user_id = :userId " , nativeQuery = true)
    void deleteByUser(@Param("userId")String userId);
    
    void deleteByUserUserId(String userId);


}
