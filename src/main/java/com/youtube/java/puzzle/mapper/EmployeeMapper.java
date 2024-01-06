package com.youtube.java.puzzle.mapper;

import com.youtube.java.puzzle.dto.EmployeeDTO;
import com.youtube.java.puzzle.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring",uses= {DepartmentMapper.class})
public interface EmployeeMapper {

    @Mappings({
            @Mapping(target = "id", source = "empId"),
            @Mapping(target = "name", source = "empName"),
            @Mapping(target = "department", source = "departmentDTO")
    })
    Employee toEntity(EmployeeDTO employeeDTO);

    @Mappings({
            @Mapping(source = "id", target = "empId"),
            @Mapping(source = "name", target = "empName"),
            @Mapping(source = "department", target = "departmentDTO")
    })
    EmployeeDTO toDTO(Employee employee);



}
