package com.jgsudhakar.springboot.springbootlog4j2slf4j.service.impl;

import com.jgsudhakar.springboot.springbootlog4j2slf4j.dto.EmployeeResDto;
import com.jgsudhakar.springboot.springbootlog4j2slf4j.service.EmpServiceIface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.springbootlog4j2slf4j.service.impl.EmpServiceImpl
 * Date    : 06-11-2025
 * Version : 1.0
 **************************************/
@Service
public class EmpServiceImpl implements EmpServiceIface {

    Logger logger = LoggerFactory.getLogger(EmpServiceImpl.class);


    /**
     * Fetch All Employees
     */
    @Override
    public List<EmployeeResDto> fetchAllEmployees() {
        logger.info("Inside fetchAllEmployees method of EmpServiceImpl");
        List<EmployeeResDto> employees = List.of(
                new EmployeeResDto(1L, "John Doe", "john.doe@example.com", "Engineering", 75000.0),
                new EmployeeResDto(2L, "Jane Smith", "jane.smith@example.com", "Marketing", 65000.0),
                new EmployeeResDto(3L, "Alice Johnson", "alice.johnson@example.com", "HR", 60000.0)
        );
        logger.debug("Fetched Employees: {}", employees);
        return employees;
    }
}
