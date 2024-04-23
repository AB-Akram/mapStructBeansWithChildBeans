package org.example.mapstructbeanswithchildbeans.mapper;

import org.example.mapstructbeanswithchildbeans.dto.EmployeeDTO;
import org.example.mapstructbeanswithchildbeans.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mapping(source = "empId", target = "id")
    @Mapping(source = "empName", target = "name")
    @Mapping(source = "departmentName", target = "department.deptName")
    Employee toEntity(EmployeeDTO employeeDTO);

    @Mapping(target = "empId", source = "id")
    @Mapping(target = "empName", source = "name")
    @Mapping(target = "departmentName", source = "department.deptName")
    EmployeeDTO toDto(Employee employee);
}
