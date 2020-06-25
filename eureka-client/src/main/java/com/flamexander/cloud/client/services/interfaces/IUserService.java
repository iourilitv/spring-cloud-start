package com.flamexander.cloud.client.services.interfaces;

import com.flamexander.cloud.client.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
        User getUserById(Long id);

        User getUserByName(String name);

        User getUserByEmail(String email);
}
