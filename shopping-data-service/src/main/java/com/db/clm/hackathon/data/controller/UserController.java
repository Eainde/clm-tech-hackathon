package com.db.clm.hackathon.data.controller;

import com.db.clm.hackathon.data.entity.User;
import com.db.clm.hackathon.data.service.UserService;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping(value="/{id}", produces = "application/json")
    public ResponseEntity<User> findById(@PathVariable int id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping(value="/", produces = "application/json")
    public ResponseEntity<List<User>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @PostMapping(value="/", produces = "application/json")
    public ResponseEntity<Void> add(@RequestBody User user){
        service.add(user);
    return new ResponseEntity<>(HttpStatus.OK);
    }

}
