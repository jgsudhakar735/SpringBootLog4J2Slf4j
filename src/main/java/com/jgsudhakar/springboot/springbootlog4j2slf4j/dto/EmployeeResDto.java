package com.jgsudhakar.springboot.springbootlog4j2slf4j.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*************************************
 * This Class is used to
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.springbootlog4j2slf4j.dto.EmployeeResDto
 * Date    : 06-11-2025
 * Version : 1.0
 **************************************/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResDto implements Serializable {

    // generate serial id
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String email;
    private String department;
    private Double salary;


    // toString Method
    @Override
    public String toString() {
        return "EmployeeResDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}