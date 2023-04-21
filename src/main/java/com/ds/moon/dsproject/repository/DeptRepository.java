package com.ds.moon.dsproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ds.moon.dsproject.entity.Dept;

@Repository
public interface DeptRepository extends JpaRepository<Dept,Long>{
    
} 