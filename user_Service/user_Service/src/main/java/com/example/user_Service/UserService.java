package com.example.user_Service;

import com.example.user_Service.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    List<User> list = List.of(
            new User(1311, "Durgesh Tiwari", "23525625"),
            new User(1312, "Ankit Tiwari", "99999"),
            new User(1314, "Ravi Tiwari", "888")
    );
    public User getUser(int id) {
        return list.stream().filter(user -> user.getUserId()==id).findAny().orElse(null);
    }
}
