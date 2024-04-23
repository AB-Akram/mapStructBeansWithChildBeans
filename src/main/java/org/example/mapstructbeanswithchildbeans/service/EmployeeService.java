package org.example.mapstructbeanswithchildbeans.service;

import org.example.mapstructbeanswithchildbeans.dto.EmployeeDTO;
import org.example.mapstructbeanswithchildbeans.entity.Employee;
import org.example.mapstructbeanswithchildbeans.mapper.EmployeeMapper;
import org.example.mapstructbeanswithchildbeans.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        return employeeRepository.save(employeeMapper.toEntity(employeeDTO));
    }

    public EmployeeDTO getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .map(employeeMapper::toDto)
                .orElse(new EmployeeDTO());
    }
}
