package com.authenticationservice.services;

import com.authenticationservice.repository.UserRepo;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
  @Autowired
  private UserRepo userRepo;
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return new User("satyam","satyam",new ArrayList<>());
  }
  public boolean isUserPresent(String username){
    return true;
  }
}
