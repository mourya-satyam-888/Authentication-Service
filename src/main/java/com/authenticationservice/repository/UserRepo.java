package com.authenticationservice.repository;

import com.authenticationservice.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepo extends JpaRepository<User,String> {
  Optional<User> findByUsername(String username);
}
