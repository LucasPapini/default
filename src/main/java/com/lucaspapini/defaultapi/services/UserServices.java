package com.lucaspapini.defaultapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaspapini.defaultapi.model.User;
import com.lucaspapini.defaultapi.repositories.UserRepository;
import com.lucaspapini.defaultapi.services.exceptions.ResourceNotFoundException;

@Service
public class UserServices {
  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }

  public User findById(Long id) {
    Optional<User> obj = repository.findById(id);
    return obj.orElseThrow(() -> new ResourceNotFoundException(id));
  }

}
