package com.example.contact_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;


    @RequestMapping("/user/{userId}")
    public List<ContactEntity> getContacts(@PathVariable("userId") int userId) {
        return this.contactService.getContactsOfUser((long) userId);
    }

}