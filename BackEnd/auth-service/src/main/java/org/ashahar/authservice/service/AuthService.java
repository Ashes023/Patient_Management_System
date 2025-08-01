package org.ashahar.authservice.service;

import org.ashahar.authservice.dto.LoginRequestDto;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private final UserService userService;

    public AuthService(UserService userService) {
        this.userService = userService;
    }


    public Optional<String> authenticate(LoginRequestDto loginRequestDTO) {

        Optional<User> user = userService.findByEmail(loginRequestDTO.getEmail());

    }

}
