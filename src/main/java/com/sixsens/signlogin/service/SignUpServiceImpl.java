package com.sixsens.signlogin.service;

import com.sixsens.signlogin.entity.User;
import com.sixsens.signlogin.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SignUpServiceImpl implements SignUpService {
    UserRepository userRepository;

    @Override
    public User createUser() {

        userRepository.save(User);


        return null;
    }
}
