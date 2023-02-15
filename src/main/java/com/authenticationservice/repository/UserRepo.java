package com.authenticationservice.repository;

import com.authenticationservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepo extends JpaRepository<User,String> {
  User findByUsername(String username);
}
