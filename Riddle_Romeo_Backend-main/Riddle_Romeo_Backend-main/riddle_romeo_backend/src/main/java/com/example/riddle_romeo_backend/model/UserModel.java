package com.example.riddle_romeo_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserModel {

    @Id
    public int id;
    public String first_name;
    public String last_name;
    public String email;
    public String password;
    public int age;
    public String profile_img;
    public int coins;
    public int ranking;
    public int getId() {
        return id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public int getAge() {
        return age;
    }
    public String getProfile_img() {
        return profile_img;
    }
    public UserModel() {
    }
    public int getCoins() {
        return coins;
    }
    public int getRanking() {
        return ranking;
    }
    public UserModel(int id, String first_name, String last_name, String email, String password, int age,
            String profile_img, int coins, int ranking) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.profile_img = profile_img;
        this.coins = coins;
        this.ranking = ranking;
    }

    
}
