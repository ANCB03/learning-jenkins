package com.ancb.basicapi.controller;

import com.ancb.basicapi.util.MessageUtils;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloController {

    private final MessageUtils messageUtils;

  @GetMapping("/hello")
    public String hello() {
      return messageUtils.getMessage();
    }

}
