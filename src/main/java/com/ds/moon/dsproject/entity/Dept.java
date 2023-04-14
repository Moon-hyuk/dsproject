package com.ds.moon.dsproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ds.moon.dsproject.dto.DeptDto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name = "dept_tb")
@ToString
public class Dept {

    @Id
    @Column(name = "dept_cd")
    private String deptCd;

    @Column(name = "dept_nm")
    private String deptNm;

    @OneToOne
    @JoinTable(name = "DEPT_USER", joinColumns = {
            @JoinColumn(name = "dept_cd", referencedColumnName = "dept_cd") }, inverseJoinColumns = {
                    @JoinColumn(name = "dept_cd", referencedColumnName = "dept_cd") })
    private User user;

    public static Dept createDept(DeptDto deptDto) {
        Dept dept = new Dept();
        dept.setDeptCd(deptDto.getDeptCd());
        dept.setDeptNm(deptDto.getDeptNm());

        return dept;
    }

}
