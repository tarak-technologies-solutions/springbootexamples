package com.taraktech.restapi.controller;

import com.taraktech.restapi.model.User;
import com.taraktech.restapi.reporitory.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserRepo userRepo;
    @GetMapping()
    public String welUser(){
        return "Welcome user...";
    }
    @GetMapping(value = "/all")
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
    @GetMapping(value = "/user/{id}")
    public User getUserById(@PathVariable("id") Long id){
        User user = userRepo.findById(id).get();
        return user;
    }
/*    @GetMapping(value = "/lname/{last_name}")
    public List<User> getUsersByLastName(@PathVariable("last_name") String last_name){
        return userRepo.findUsersByLast_name(last_name);
    }*/
    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "Saved.....";
    }
    @PutMapping(value = "/update/{id}")
    public String updateUser(@PathVariable("id") Long id,@RequestBody User user){
        User user1 = userRepo.findById(id).get();
        user1.setFirst_name(user.getFirst_name());
        user1.setLast_name(user.getLast_name());
        user1.setAge(user.getAge());
        user1.setOccupation(user.getOccupation());
        userRepo.save(user1);
        return "Updated......";
    }
    @DeleteMapping(value = "/remove/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        userRepo.deleteById(id);
        return "Deleted....";
    }
    @DeleteMapping(value = "/remove")
    public String deleteAllUsers(){
        userRepo.deleteAll();
        return "All users are deleted....";
    }
}
