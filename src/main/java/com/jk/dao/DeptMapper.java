package com.jk.dao;

import com.jk.model.Dept;

import java.util.List;
public interface DeptMapper {
    int deleteByPrimaryKey(Long deptId);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long deptId);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

     public List<Dept> deptlist(Dept dept);
}