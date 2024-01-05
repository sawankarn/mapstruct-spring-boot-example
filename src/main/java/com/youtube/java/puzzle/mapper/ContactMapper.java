package com.youtube.java.puzzle.mapper;

import com.youtube.java.puzzle.dto.ContactDTO;
import com.youtube.java.puzzle.model.Contact;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContactMapper {
    Contact toEntity(ContactDTO contactDTO);
    ContactDTO toDTO(Contact contact);
    List<ContactDTO> toDTOList(List<Contact> contacts);
}
