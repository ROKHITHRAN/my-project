package com.example.riddle_romeo_backend.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.riddle_romeo_backend.model.UserModel;
import com.example.riddle_romeo_backend.repository.UserRepo;

@Service
public class UserService {
    @Autowired
    UserRepo jr;
    public UserModel savedata(UserModel j)
    {
        return jr.save(j);
    }
    public Optional<UserModel> findid(int id)
    {
        return jr.findById(id);
    }
    public List<UserModel> listdata()
    {
        return jr.findAll();
    }

    public void deleteid(@PathVariable int id)
    {
         jr.deleteById(id);
    }
}
