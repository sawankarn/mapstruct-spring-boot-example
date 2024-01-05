package com.youtube.java.puzzle.controller;

import com.youtube.java.puzzle.dto.ContactDTO;
import com.youtube.java.puzzle.model.Contact;
import com.youtube.java.puzzle.service.ContactService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    private ContactService contactService;
    @PostMapping("/contact")
    public ResponseEntity<Contact> saveContact(@RequestBody ContactDTO contactDTO){
        return ResponseEntity.ok(contactService.saveContact(contactDTO));
    }

    @GetMapping("/contact/{id}")
    public ResponseEntity<ContactDTO> getContactById(@PathVariable Long id){
        return ResponseEntity.ok(contactService.getContactById(id));
    }

    @GetMapping("/contacts")
    public ResponseEntity<List<ContactDTO>> getContactList(){
        return ResponseEntity.ok(contactService.getContactList());
    }
}
