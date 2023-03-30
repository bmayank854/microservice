package com.example.user_Service.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Contact {
    private int cId;
    private String email;
    private String contactName;
    private int userId;

}
