package com.vincentkdeli.vinance.web.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author - Vincent K. Deli
 **/

@RestController
public class HomeController {

  @RequestMapping(method = RequestMethod.GET,value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  public String home() {
    return "Hello World";
  }

}
