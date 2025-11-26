package com.sprintAnnotations.projectAnnotation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SampleController {

    // GET API
    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        return new ResponseEntity<>("Hello from GET API!", HttpStatus.OK);
    }

    // POST API
    @PostMapping("/hello")
    public ResponseEntity<String> postHello(@RequestBody String name) {
        return new ResponseEntity<>("Hello " + name + " from POST API!", HttpStatus.CREATED);
    }
}
