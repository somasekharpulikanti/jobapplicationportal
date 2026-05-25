package com.lionix.jobapplicationportal.service;

import com.lionix.jobapplicationportal.entity.LoginRequest;
import com.lionix.jobapplicationportal.entity.LoginResponse;
import com.lionix.jobapplicationportal.entity.User;
import com.lionix.jobapplicationportal.repo.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    LoginRepository repo;
    public LoginResponse Login(LoginRequest req){
        Optional<User> userOpt = repo.findByUsername(req.getEmpId());
        LoginResponse respose = new LoginResponse();

        if (userOpt.isPresent()) {
            respose.setStatusCode(201);
            respose.setMessage("Success");
            respose.setReposeMessage("Login Success");
            respose.setTimeStamp(LocalDateTime.now());
            return respose;
        }
        respose.setStatusCode(401);
        respose.setMessage("Unauthorized");
        respose.setReposeMessage("INVALID_CREDENTIALS");
        respose.setTimeStamp(LocalDateTime.now());
        return respose;
    }
}
