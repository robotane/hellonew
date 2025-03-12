package com.robotane.hellonew.endpoint.rest.controller;

import com.robotane.hellonew.mail.Email;
import com.robotane.hellonew.mail.Mailer;
import jakarta.mail.internet.InternetAddress;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloController {
  private final Mailer mailer;

  @GetMapping("/hello")
  @SneakyThrows
  public String helloWorld(@RequestParam String to) {
    var email =
        new Email(new InternetAddress(to), List.of(), List.of(), "Hello world", "Hello Again !", List.of());

    mailer.accept(email);
    return "Hello Angain !";
  }
}
