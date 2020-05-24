package com.sixsens.signlogin.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Table(name = "user")
public class User implements Serializable { // 회원 가입을 위한 entity

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;

    @Column(nullable = false, length = 120, unique = true)  // 추후 이메일인증
    private String email;

    @Column(nullable = false, length = 50)
    @NotNull
    private String password;

    @Column(nullable = false, length = 50)
    private String PhoneNumber;

    @Column(nullable = false, length = 50)
    private String secondPhoneNumber;
}
