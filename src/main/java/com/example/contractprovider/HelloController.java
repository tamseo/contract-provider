package com.example.contractprovider;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity hello() {
        HashMap<String, String> message = new HashMap<>();
        message.put("message", "Hello world");
        return new ResponseEntity(message, HttpStatus.OK);
    }
}
