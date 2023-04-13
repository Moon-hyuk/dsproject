package com.ds.moon.dsproject.entity;

import javax.persistence.Entity;

import com.ds.moon.dsproject.dto.UserDto;

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
     private String userId;
    @Column(name = "user_nm")
    private String userNm;
    @Column(name = "user_eml_addr")
    private String userEmlAddr;
    @Column(name = "user_telno")
    private String userTelno;
    @Column(name = "user_addr")
    private String userAddr;
    @Column(name = "user_aprv_yn")
    private String userAprvYn;
    @Column(name = "dept_no")
    private int deptNo;

    public static User createMember(UserDto userDto) {
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setUserEmlAddr(userDto.getUserEmlAddr());
        user.setUserTelno(userDto.getUserTelno());
        user.setUserAddr(userDto.getUserAddr());
        user.setUserAprvYn(userDto.getUserAprvYn());
        user.setDeptNo(userDto.getDeptNo());
        return user;
    }
}
