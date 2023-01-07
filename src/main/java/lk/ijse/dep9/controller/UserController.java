package lk.ijse.dep9.controller;

import lk.ijse.dep9.exception.UserNotFoundException;
import lk.ijse.dep9.model.User;
import lk.ijse.dep9.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")

public class UserController {
    @Autowired
    private UserRepository userRepository;



    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();

    }
    @GetMapping("user/{id}")
    User getUserById(@PathVariable Long id){
        return userRepository.findById(id)
                .orElseThrow(()->new UserNotFoundException(id));
    }

}
