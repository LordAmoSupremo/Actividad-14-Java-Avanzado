package com.example.activity14;

import com.example.activity14.model.User;
import com.example.activity14.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createuser(User user){
        return userRepository.save(user);

    }
    public User getUserById(Long Id){
        Optional<User> optionalUser = userRepository.findById(Id);
        return optionalUser.get();

    }
    public List<User> getAllUsers( ){
        return userRepository.findAll();

    }
    public void deleteUser(Long Id){
        userRepository.deleteById(Id);

    }
}
