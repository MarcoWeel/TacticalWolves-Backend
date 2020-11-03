package com.tacticalwolves.accountapi.controller;

import com.tacticalwolves.accountapi.service.UserService;
import com.tacticalwolves.accountapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/User")
    public User addUser(@RequestBody User user){return service.SaveUser(user);}

    @GetMapping("/User/{Id}")
    public User findUserById(@RequestBody int Id){return service.GetUserById(Id);}

    @GetMapping("/User")
    public List<User> findAllUsers(){return service.GetUsers();}

    @PutMapping("/User")
    public User updateUser(@RequestBody User user){return service.UpdateUser(user);}

    @DeleteMapping("/User/{Id}")
    public String deleteUser(@RequestBody int Id){return service.DeleteUserById(Id);}

}
