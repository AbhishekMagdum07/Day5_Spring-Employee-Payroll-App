package com.bridgelabz.employeepayroll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeePayrollDTO {
    @NotBlank(message = "Employee name cannot be null")
    @Pattern(regexp = "^[A-Z][a-zA-Z]{2,}$", message = "Employee name is Invalid ")
    public String name;

    @Min(value = 500, message = "Min Wage should be more than 500")
    public long salary;

    public String gender;

    public LocalDate startDate;

    public String note;

    public String profilePic;

    public String department;
}
