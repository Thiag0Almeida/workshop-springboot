package com.almeidathi.course.resources;

import com.almeidathi.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
   @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1l, "Thiago", "thi@go.com", "71912345678", "654321");
        return ResponseEntity.ok().body(u);
    }
}
