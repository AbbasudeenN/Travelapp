package com.example.Travelapp.service;

import com.example.Travelapp.entity.ContactEntity;
import com.example.Travelapp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public ContactEntity saveContact(ContactEntity contactEntity){
        return contactRepository.save(contactEntity);
    }
}
