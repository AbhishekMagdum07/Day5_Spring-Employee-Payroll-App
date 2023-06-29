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

    @Pattern(regexp = "male|female", message = "Gender needs to be male or female")
    public String gender;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @PastOrPresent( message = "startDate should Not be Empty")
    public LocalDate startDate;

    @NotBlank(message = "Note cannot be empty")
    public String note;

    @NotEmpty(message = "profilePic cannot be Empty")
    public String profilePic;

    @NotNull(message = "department should Not be Empty")
    public String department;
}
