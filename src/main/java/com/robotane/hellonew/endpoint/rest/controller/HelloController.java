package com.robotane.hellonew.endpoint.rest.controller;

import com.robotane.hellonew.service.HelloService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloController {
  private final HelloService service;

  @GetMapping("/hello")
  public String helloWorld(@RequestParam String name) {
    return service.uploadHelloWorldMessage(name);
  }
}
