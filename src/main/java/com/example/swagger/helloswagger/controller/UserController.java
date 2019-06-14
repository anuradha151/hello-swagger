package com.example.swagger.helloswagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping
    public List<User> getAllUsers() {
        return Arrays.asList(
                new User("Anu", 1995),
                new User("Sam", 1995)
        );
    }

    @GetMapping("byUserName/{userName}")
    public User getUser(@PathVariable("userName") String userName) {
        return new User(userName, 1993);
    }


    private class User {
        private String userName;
        private int dob;

        public User(String userName, int dob) {
            this.setUserName(userName);
            this.setDob(dob);
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getDob() {
            return dob;
        }

        public void setDob(int dob) {
            this.dob = dob;
        }
    }

}

