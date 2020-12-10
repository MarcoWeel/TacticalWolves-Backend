package com.tacticalwolves.accountapi.controller;

import com.tacticalwolves.accountapi.service.UserService;
import com.tacticalwolves.accountapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/users")
    public User addUser(@RequestBody User user){return service.SaveUser(user);}

    @GetMapping("/users/{Id}")
    public User findUserById(@PathVariable int Id){return service.GetUserById(Id);}

    @GetMapping("/users")
    public List<User> findAllUsers(){return service.GetUsers();}

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){return service.UpdateUser(user);}

    @DeleteMapping("/users/{Id}")
    public String deleteUser(@PathVariable int Id){return service.DeleteUserById(Id);}

}
