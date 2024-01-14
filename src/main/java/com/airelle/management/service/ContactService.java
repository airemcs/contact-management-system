package com.airelle.management.service;

import com.airelle.management.model.Contact;
import org.springframework.stereotype.Service;

@Service
public interface ContactService {

    public Contact add(Contact contact);

}
