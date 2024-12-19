package com.lucaspapini.defaultapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucaspapini.defaultapi.model.User;
import com.lucaspapini.defaultapi.services.UserServices;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {

  @Autowired
  UserServices services;

  @GetMapping(value = "/fakeUser", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<User> fakeUserTesting() {
    User user = new User(1L, "Lucas", "Papin", "lucas.papini@gmail.com.br", "123", 1,
        1);
    return ResponseEntity.ok().body(user);
  }

  @GetMapping
  public ResponseEntity<List<User>> findAll() {
    List<User> users = services.findAll();
    return ResponseEntity.ok().body(users);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<User> findById(@PathVariable Long id) {
    User obj = services.findById(id);
    return ResponseEntity.ok().body(obj);
  }

}
