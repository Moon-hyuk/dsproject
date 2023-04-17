package com.ds.moon.dsproject.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeptDto {

    private String deptCd;
    
    private String deptNm;
}
