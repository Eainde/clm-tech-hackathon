package com.db.clm.hackathon.data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "APP_USER")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class User {
  @Id
  @Column(name = "user_id")
  private int id;

  @Column(name = "user_name")
  private String name;

  @Column(name = "email")
  private String email;

  @Column(name = "user_role")
  private String role;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Address> addresses;
}
