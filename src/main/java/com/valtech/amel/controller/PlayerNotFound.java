package com.valtech.amel.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason = "Player not found.")
public class PlayerNotFound extends RuntimeException{

}
