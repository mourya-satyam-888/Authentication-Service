package com.authenticationservice.exceptions;

import com.authenticationservice.enums.ExceptionCode;

/**
 * The type Resource exception.
 */
public class ResourceException extends BaseApplicationException{
  /**
   * Instantiates a new Resource exception.
   *
   * @param message the message
   */
  public ResourceException(String message) {
    super(message, ExceptionCode.RESOURCE_NOT_FOUND);
  }
}
