package com.ds.moon.dsproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ds.moon.dsproject.entity.Hb;
import com.ds.moon.dsproject.repository.HbRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class HbService {
    private final HbRepository hbRepository;

    public List<Hb> getListHb(){
     return hbRepository.findAllByOrderByHbCdAsc();   
    }

}
