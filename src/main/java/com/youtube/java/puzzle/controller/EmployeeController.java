package com.youtube.java.puzzle.controller;

import com.youtube.java.puzzle.dto.EmployeeDTO;
import com.youtube.java.puzzle.dto.EmployeeDetailsDTO;
import com.youtube.java.puzzle.model.Employee;
import com.youtube.java.puzzle.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return ResponseEntity.ok(employeeService.saveEmployee(employeeDTO));
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @GetMapping("/employee-details/{id}")
    public ResponseEntity<EmployeeDetailsDTO> getEmployeeDetailsById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeDetailsById(id));
    }
}
