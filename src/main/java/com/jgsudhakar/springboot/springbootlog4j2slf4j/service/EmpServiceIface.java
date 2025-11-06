package com.jgsudhakar.springboot.springbootlog4j2slf4j.service;

import com.jgsudhakar.springboot.springbootlog4j2slf4j.dto.EmployeeResDto;

import java.util.List;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.springbootlog4j2slf4j.service.EmpServiceIface
 * Date    : 06-11-2025
 * Version : 1.0
 **************************************/
public interface EmpServiceIface {

    public List<EmployeeResDto> fetchAllEmployees();
}
