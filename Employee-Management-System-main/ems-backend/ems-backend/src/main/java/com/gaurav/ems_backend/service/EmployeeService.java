package com.gaurav.ems_backend.service;

import com.gaurav.ems_backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee (Long employeeId);
}
