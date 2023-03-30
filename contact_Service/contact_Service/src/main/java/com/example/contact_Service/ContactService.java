package com.example.contact_Service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactService {

    List<ContactEntity> list = List.of(
            new ContactEntity(1, "amit@gmail.com", "Amit", 1311),
            new ContactEntity(2, "anil@gmail.com", "Anil", 1311),
            new ContactEntity(3, "rohan@gmail.com", "Rohan", 1312),
            new ContactEntity(4, "sameer@gmail.com", "Sameer", 1314)
    );



    public List<ContactEntity> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId()==userId).collect(Collectors.toList());
    }
}
