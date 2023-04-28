package com.alibou.security.demo;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
@Hidden
public class DemoController {

  @GetMapping("/notSecured")
  public ResponseEntity<String> notSecured() {
    return ResponseEntity.ok("Hello from notsecured endpoint");
  }

  @GetMapping("/secured")
  public ResponseEntity<String> secured() {
    return ResponseEntity.ok("Hello from secured endpoint");
  }

}
