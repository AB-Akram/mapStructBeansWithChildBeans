package org.example.mapstructbeanswithchildbeans.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
    private Long empId;
    private String empName;
    private String email;
    private float salary;
    private String departmentName;
}
