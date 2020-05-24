package com.sixsens.signlogin.repository;

import com.sixsens.signlogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
