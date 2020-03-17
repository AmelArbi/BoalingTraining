package com.valtech.amel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Invalid value.")
public class InvalidValueException extends RuntimeException {

    public InvalidValueException() {

    }
}
