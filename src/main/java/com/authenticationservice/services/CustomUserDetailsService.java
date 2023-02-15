package com.authenticationservice.services;

import com.authenticationservice.entity.User;
import com.authenticationservice.model.CustomUserDetails;
import com.authenticationservice.repository.UserRepo;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
  public CustomUserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
    final Optional< User> user=userRepo.findByUsername(username);
    user.orElseThrow(()->new UsernameNotFoundException("Not found "+username));
    return user.map(CustomUserDetails::new).get();
  }
  public boolean isUserPresent(final String username){
    return userRepo.findByUsername(username).isPresent();
  }
}
