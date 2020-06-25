package com.flamexander.cloud.client.repositories.interfaces;

import com.flamexander.cloud.client.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

    User getUserByUserNameEquals(String userName);

    User getUserByEmailEquals(String email);
}
