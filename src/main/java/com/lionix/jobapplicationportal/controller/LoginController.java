package com.lionix.jobapplicationportal.controller;

import com.lionix.jobapplicationportal.entity.LoginRequest;
import com.lionix.jobapplicationportal.entity.LoginResponse;
import com.lionix.jobapplicationportal.service.LoginService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1")
public class LoginController {
    @Autowired
    LoginService service;
    @PostMapping("/login")
    public LoginResponse login(HttpServletRequest servletRequest, @RequestBody LoginRequest request) {
        LoginResponse response = service.Login(request);
        LoginResponse r = new LoginResponse(201,"","", LocalDateTime.now(),"");
        response.setPath(servletRequest.getRequestURI());
        return response;
    }
    
    
}
