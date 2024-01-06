package com.youtube.java.puzzle.mapper;

import com.youtube.java.puzzle.dto.DepartmentDTO;
import com.youtube.java.puzzle.model.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    Department toEntity(DepartmentDTO departmentDTO);

    DepartmentDTO toDTO(Department department);
}
