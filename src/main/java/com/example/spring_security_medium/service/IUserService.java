package com.example.spring_security_medium.service;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService {
    UserDetailsService  userDetailsService();
}
