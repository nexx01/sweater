package com.example.sweater.config.initializer;


import com.example.sweater.domain.Role;
import com.example.sweater.domain.User;
import com.example.sweater.repos.MessageRepo;
import com.example.sweater.repos.UserRepo;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Data
@Service
public class TestDataInitService {

     final UserRepo userRepo;
    final MessageRepo messageRepo;

    public TestDataInitService(UserRepo userRepo, MessageRepo messageRepo) {
        this.userRepo = userRepo;
        this.messageRepo = messageRepo;
    }



    public void createEntity() {
        User user = new User();
        user.setUsername("user");
        user.setPassword("user");
        user.setRoles(Collections.singleton(Role.USER));
        user.setActive(true);
        userRepo.save(user);



    }
}
