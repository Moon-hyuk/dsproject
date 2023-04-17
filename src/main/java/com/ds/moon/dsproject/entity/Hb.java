package com.ds.moon.dsproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "hb_tb")
@ToString
public class Hb {
    @Id
    @Column(name = "hb_cd")
    private String hbCd;
    
    @Column(name = "hb_Nm")
    private String hbNm;
}
