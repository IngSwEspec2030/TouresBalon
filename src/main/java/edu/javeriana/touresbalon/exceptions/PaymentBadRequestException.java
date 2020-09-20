package edu.javeriana.touresbalon.exceptions;

public class PaymentBadRequestException extends RuntimeException {
  public PaymentBadRequestException(String message) {
    super(message);
  }
}
