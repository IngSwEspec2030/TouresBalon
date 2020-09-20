package edu.javeriana.touresbalon.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ConvenioNotFoundException extends RuntimeException {

  public ConvenioNotFoundException(String message) {
    super(message);
  }
}
