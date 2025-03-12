package com.robotane.hellonew.endpoint.rest.controller;

import com.robotane.hellonew.endpoint.event.EventProducer;
import com.robotane.hellonew.endpoint.event.model.SendEmailRequested;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloController {
  private final EventProducer<SendEmailRequested> eventProducer;

  @GetMapping("/hello")
  @SneakyThrows
  public String helloWorld(@RequestParam String to) {
    var event = SendEmailRequested.builder().to(to).build();
    eventProducer.accept(List.of(event));
    return "Hello Again !";
  }
}
