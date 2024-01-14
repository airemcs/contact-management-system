package com.airelle.management.controller;

import com.airelle.management.model.Contact;
import com.airelle.management.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping("/contact")
    public static String index() {
        return "Hello!";
    }

    @PostMapping("/add")
    public Contact addContact(@RequestBody Contact contact) {
        return contactService.add(contact);
    }

}
