package com.tacticalwolves.accountapi.service;

import com.tacticalwolves.accountapi.repository.UserRepository;
import com.tacticalwolves.accountapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User SaveUser(User user){
    return repository.save(user);
    }

    public List<User> GetUsers(){
        return repository.findAll();
    }

    public User GetUserById(int Id){
        return repository.findById(Id).orElse(null);
    }

    public String DeleteUserById(int Id){
        repository.deleteById(Id);
        return "User Deleted";
    }

    //Password moet via authentication dmv callback nu tijdelijk ongehasht voor testen
    public User UpdateUser(User user){
        User ExistingUser = GetUserById(user.getId());
        ExistingUser.setEmail(user.getEmail());
        ExistingUser.setName(user.getName());
        ExistingUser.setRole(user.getRole());
        ExistingUser.setPasswordHash(user.getPasswordHash());
        return repository.save(ExistingUser);
    }

}
