package com.lucaspapini.defaultapi.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
  private static final long serialVersionUID = 1l;

  public ResourceNotFoundException(Long id) {
    super("Resource not found. Id: " + id);
  }
}
