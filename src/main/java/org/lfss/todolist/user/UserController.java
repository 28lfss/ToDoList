package org.lfss.todolist.user;

import org.lfss.todolist.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("/user")
    public String deleteUser(@RequestBody User user) {
        return userService.deleteUser(user);
    }

    @GetMapping("/user")
    public String checkUser(@RequestBody User user) {
        return userService.checkUser(user);
    }
}