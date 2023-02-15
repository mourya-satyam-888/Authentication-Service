package com.authenticationservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user_table")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String id;
  private String username;
  private String password;
}
