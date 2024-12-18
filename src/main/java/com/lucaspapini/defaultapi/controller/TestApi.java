package com.lucaspapini.defaultapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/test/v1")
public class TestApi {

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<String> testStatusAPI() {
    return Arrays.asList("STATUS: OK", "API REST UPPING!");
  }

}
