package com.airelle.management.controller;

import com.airelle.management.model.Contact;
import com.airelle.management.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping("")
    public List<Contact> getContacts() {
        return contactService.getAll();
    }

    @GetMapping("/{id}")
    public Contact getContact(@PathVariable Integer id) {
        return contactService.get(id);
    }

    @PostMapping("/add")
    public Contact addContact(@RequestBody Contact contact) {
        return contactService.add(contact);
    }

    @PutMapping("/update")
    public Contact updateContact(@RequestBody Contact contact) {
        return contactService.update(contact);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteContact(@PathVariable Integer id) {
        return contactService.delete(id);
    }

}
