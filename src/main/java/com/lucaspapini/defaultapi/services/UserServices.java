package com.lucaspapini.defaultapi.services;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaspapini.defaultapi.model.User;
import com.lucaspapini.defaultapi.repositories.UserRepository;
import com.lucaspapini.defaultapi.services.exceptions.ResourceNotFoundException;

@Service
public class UserServices {
  private Logger logger = Logger.getLogger(UserServices.class.getName());

  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }

  public User findById(Long id) {
    Optional<User> obj = repository.findById(id);
    return obj.orElseThrow(() -> new ResourceNotFoundException(id));
  }

  public User insert(User params) {
    logger.info("Creating a new user...");
    return repository.save(params);
  }

}
