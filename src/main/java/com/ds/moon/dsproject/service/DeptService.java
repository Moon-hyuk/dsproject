package com.ds.moon.dsproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ds.moon.dsproject.entity.Dept;
import com.ds.moon.dsproject.repository.DeptRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class DeptService{
    private final DeptRepository deptRepository;

    public List<Dept> getListDept(){
        return deptRepository.findAll();
    }
}