package com.db.clm.hackathon.data.service;

import com.db.clm.hackathon.data.entity.User;

import java.util.List;

import com.db.clm.hackathon.data.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository repository;

  public User findById(long id) {
    return repository.findById(id).get();
  }

  public List<User> findAll() {
    return repository.findAll();
  }

  public void add(User user) {
    repository.save(user);
  }
}
