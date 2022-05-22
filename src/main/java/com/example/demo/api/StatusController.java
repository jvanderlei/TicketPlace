package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
  @GetMapping(path = "/api/v1/status")
  public String getStatus() {
    return "Server is online!";
  }
}