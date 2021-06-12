package com.flamexander.cloud.client.services;

import com.flamexander.cloud.client.entities.User;
import com.flamexander.cloud.client.repositories.interfaces.IUserRepository;
import com.flamexander.cloud.client.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService implements IUserService {
    private IUserRepository userRepository;

    @Autowired
    public void setUserRepository(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    @Transactional
    public User getUserByName(String userName) {
        return userRepository.getUserByUserNameEquals(userName);
    }

    @Override
    @Transactional
    public User getUserByEmail(String email) {
        return userRepository.getUserByEmailEquals(email);
    }


}
