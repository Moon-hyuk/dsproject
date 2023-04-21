package com.ds.moon.dsproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ds.moon.dsproject.entity.Hb;

@Repository
public interface HbRepository extends JpaRepository<Hb, Long>{
    
    List<Hb> findAllByOrderByHbCdAsc();
}
