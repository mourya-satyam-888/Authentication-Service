package com.authenticationservice.model;

import com.authenticationservice.entity.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
@Getter
public class CustomUserDetails implements UserDetails {
  private String id;
  private String username;
  private String password;
  private List<GrantedAuthority> authorities;

  public CustomUserDetails(User user) {
    this.id = user.getId();
    this.username=user.getUsername();
    this.password=user.getPassword();
    this.authorities=new ArrayList<>();
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
