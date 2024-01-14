package com.airelle.management.service.impl;

import com.airelle.management.model.Contact;
import com.airelle.management.repository.ContactRepository;
import com.airelle.management.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactRepository contactRepository;

    @Override
    public Contact add(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> getAll() {
        return contactRepository.findAll();
    }

    @Override
    public Contact get(Integer id) {
        return contactRepository.findById(id).get();
    }
}
