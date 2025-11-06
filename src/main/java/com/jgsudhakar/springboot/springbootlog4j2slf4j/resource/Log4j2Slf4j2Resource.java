package com.jgsudhakar.springboot.springbootlog4j2slf4j.resource;

import com.jgsudhakar.springboot.springbootlog4j2slf4j.dto.EmployeeResDto;
import com.jgsudhakar.springboot.springbootlog4j2slf4j.service.EmpServiceIface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.springbootlog4j2slf4j.resource.Log4j2Slf4j2Resource
 * Date    : 06-11-2025
 * Version : 1.0
 **************************************/
@RestController
@RequestMapping("/v1/log4j2slf4j")
public class Log4j2Slf4j2Resource {

    Logger logger = LoggerFactory.getLogger(Log4j2Slf4j2Resource.class);

    @Autowired
    private EmpServiceIface empService;

    /**
     * Get API to fetch all employees
     */
    @GetMapping("/employees")
    public List<EmployeeResDto> getAllEmployees() {
        logger.info("Fetching all employees");
        return empService.fetchAllEmployees();
    }
}
