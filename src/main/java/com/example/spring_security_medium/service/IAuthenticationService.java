package com.example.spring_security_medium.service;

import com.example.spring_security_medium.request.SignUpRequest;
import com.example.spring_security_medium.request.SigninRequest;
import com.example.spring_security_medium.response.JwtAuthenticationResponse;

public interface IAuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
