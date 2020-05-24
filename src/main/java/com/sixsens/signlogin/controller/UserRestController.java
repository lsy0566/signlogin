package com.sixsens.signlogin.controller;

import com.sixsens.signlogin.repository.UserRepository;
import com.sixsens.signlogin.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserRestController {
    @Autowired
    SignUpService signUpService;

    @Autowired
    UserRepository userRepository;

//    @PostMapping("/signup")
//    public

}
