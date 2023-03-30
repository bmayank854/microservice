package com.example.contact_Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactEntity {


        private int cId;
        private String email;
        private String contactName;
        private int userId;

    }
