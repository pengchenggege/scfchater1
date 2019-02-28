package com.jk.controller;

import com.jk.model.Dept;
import com.jk.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
   private DeptService deptService;

    @RequestMapping("/deptlist")
     public List<Dept> deptlist(Dept dept){
         return deptService.deptlist(dept);
     }
}
