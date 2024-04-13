package com.example.riddle_romeo_backend.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.riddle_romeo_backend.model.UserModel;
import com.example.riddle_romeo_backend.service.UserService;

import ch.qos.logback.classic.spi.STEUtil;


@RestController
public class UserController{

    @Autowired
    UserService js;
    
  
    @PostMapping("/api/login")
    public UserModel putdata(@RequestBody UserModel j) 
    {
       return js.savedata(j);
    }

    @GetMapping("/api/login/show/{id}")
    public  Optional<UserModel> showdata(@PathVariable  int id) 
    {
        return js.findid(id);
    }

    @GetMapping("/api/login/showall")
    public List<UserModel> showlist() {
        return js.listdata();
    }

    @PutMapping("/api/login/update/{id}")
    public UserModel editdata(@PathVariable int id, @RequestBody UserModel  b) {
        return js.savedata(b);
    } 
    @DeleteMapping("/api/login/delete/{id}")   
    public void deletedata(@PathVariable int id)
    {
        js.deleteid(id);    
    }
}