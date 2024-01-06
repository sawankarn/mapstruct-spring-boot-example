package com.youtube.java.puzzle.service;

import com.youtube.java.puzzle.dto.EmployeeDTO;
import com.youtube.java.puzzle.mapper.EmployeeMapper;
import com.youtube.java.puzzle.model.Employee;
import com.youtube.java.puzzle.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeMapper employeeMapper;

    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        return employeeRepository.save(employeeMapper.toEntity(employeeDTO));
    }

    public EmployeeDTO getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .map(employeeMapper::toDTO )
                .orElse(new EmployeeDTO());
    }
}