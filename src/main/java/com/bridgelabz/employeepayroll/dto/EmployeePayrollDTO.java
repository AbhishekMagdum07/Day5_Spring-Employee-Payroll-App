package com.bridgelabz.employeepayroll.dto;

import lombok.*;
import org.springframework.boot.context.properties.ConstructorBinding;

import javax.persistence.ConstructorResult;
import java.beans.ConstructorProperties;


@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeePayrollDTO {
    public String name;
    public long salary;
}
