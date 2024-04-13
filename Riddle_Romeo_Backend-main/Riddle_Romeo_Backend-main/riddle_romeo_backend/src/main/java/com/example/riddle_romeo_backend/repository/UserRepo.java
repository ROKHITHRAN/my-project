package com.example.riddle_romeo_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.riddle_romeo_backend.model.UserModel;

public interface UserRepo extends JpaRepository <UserModel,Integer> {

    

}
