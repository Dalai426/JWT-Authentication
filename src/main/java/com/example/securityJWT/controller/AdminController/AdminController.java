package com.example.securityJWT.controller.AdminController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @GetMapping("/admin")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("it is admin !!!");
    }
}
