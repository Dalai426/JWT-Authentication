package com.example.securityJWT.controller.DemoController;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
@PreAuthorize("hasRole('DEMO')")
public class DemoController {
    @GetMapping("/demo")
    public ResponseEntity<String>sayHello(){
        return ResponseEntity.ok("it is demo !!!");
    }
}
