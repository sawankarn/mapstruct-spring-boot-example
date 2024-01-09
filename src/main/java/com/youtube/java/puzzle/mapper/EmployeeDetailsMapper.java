package com.youtube.java.puzzle.mapper;

import com.youtube.java.puzzle.dto.EmployeeDetailsDTO;
import com.youtube.java.puzzle.model.Department;
import com.youtube.java.puzzle.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/*mapping multiple sources*/
@Mapper(componentModel = "spring")
public interface EmployeeDetailsMapper {
    @Mappings({
            @Mapping(source = "employee.id", target = "empId"),
            @Mapping(source = "employee.name", target = "empName"),
            @Mapping(source = "department.deptName", target = "deptName"),
            @Mapping(source = "department.id", target = "deptId")
    })
    EmployeeDetailsDTO toEmployeeDetailsDTO(Employee employee, Department department);
}
