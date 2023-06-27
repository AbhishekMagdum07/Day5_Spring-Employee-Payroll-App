package com.bridgelabz.employeepayroll.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeePayrollDTO {
    @NotBlank(message = "Employee name cannot be null")
    @Pattern(regexp = "^[A-Z][a-zA-Z]{2,}$")
    public String name;
    public long salary;
}
