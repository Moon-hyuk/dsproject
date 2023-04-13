package com.ds.moon.dsproject.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "user_tb")
@Getter
@Setter
@ToString
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String USER_NM;
    private String USER_EML_ADDR;
    private String USER_TELNO;
    private String USER_ADDR;
    private String USER_APRV_YN;
    private int DEPT_NO;

}
