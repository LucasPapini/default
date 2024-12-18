package com.lucaspapini.defaultapi.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucaspapini.defaultapi.model.User;

@RestController
@RequestMapping(value = "/api/user/v1")
public class UserController {

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<User> fakeUserTesting() {

    User user = new User(1L, "Lucas", "Papin", "lucas.papini@gmail.com.br", "123", 1,
        1);
    return ResponseEntity.ok().body(user);
  }
}
