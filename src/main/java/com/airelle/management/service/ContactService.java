package com.airelle.management.service;

import com.airelle.management.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {

    public Contact add(Contact contact);
    public List<Contact> getAll();
    public Contact get(Integer id);
    public Contact update(Contact contact);
    public String delete(Integer id);

}
