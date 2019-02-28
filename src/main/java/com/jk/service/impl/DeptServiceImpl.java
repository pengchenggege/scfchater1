package com.jk.service.impl;

import com.jk.dao.DeptMapper;
import com.jk.model.Dept;
import com.jk.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> deptlist(Dept dept) {
        return deptMapper.deptlist(dept);
    }
}
