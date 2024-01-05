package com.youtube.java.puzzle.service;

import com.youtube.java.puzzle.dto.ContactDTO;
import com.youtube.java.puzzle.mapper.ContactMapper;
import com.youtube.java.puzzle.model.Contact;
import com.youtube.java.puzzle.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private ContactMapper contactMapper;

    public Contact saveContact(ContactDTO contactDTO){
//        Contact contact = Contact.builder()
//                .firstName(contactDTO.getFirstName())
//                .email(contactDTO.getEmail())
//                .phoneNo(contactDTO.getPhoneNo())
//                .lastName(contactDTO.getLastName())
//                .build();
//        return contactRepository.save(contact);
        return contactRepository.save(contactMapper.toEntity(contactDTO));
    }

    public ContactDTO getContactById(Long id) {
//        Optional<Contact> contact = contactRepository.findById(id);
//        return contact.map(value -> ContactDTO.builder()
//                .id(id)
//                .firstName(value.getFirstName())
//                .lastName(value.getLastName())
//                .email(value.getEmail())
//                .phoneNo(value.getPhoneNo())
//                .build()).orElse(null);
        return contactRepository.findById(id)
                .map(contactMapper::toDTO)
                .orElse(new ContactDTO());
    }

    public List<ContactDTO> getContactList() {
//        return contactRepository.findAll().stream().map(contact ->{
//            return ContactDTO.builder()
//                    .id(contact.getId())
//                    .firstName(contact.getFirstName())
//                    .lastName(contact.getLastName())
//                    .email(contact.getEmail())
//                    .phoneNo(contact.getPhoneNo())
//                    .build();
//        }).collect(Collectors.toList());
        List<Contact> contacts = contactRepository.findAll();
        return contactMapper.toDTOList(contacts);
    }

}
