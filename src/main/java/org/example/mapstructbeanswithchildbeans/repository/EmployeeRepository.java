package org.example.mapstructbeanswithchildbeans.repository;

import org.example.mapstructbeanswithchildbeans.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
