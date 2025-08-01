package org.ashahar.authservice.service;

import org.ashahar.authservice.repo.UserRepo;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepo userrepo;
    public UserService(UserRepo userrepo) {
        this.userrepo = userrepo;
    }

    public Optional<User> findByEmail(String email) {
        return userrepo.findByEmail(email);
    }

}
