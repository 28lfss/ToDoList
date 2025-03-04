package org.lfss.todolist.user;

import org.lfss.todolist.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    String createUser(User user) {
        if(userRepository.findByUid(user.userGoogleUid).isEmpty()) {
            userRepository.save(user);
            return "user created";
        }
        else {return "user already exists";}
    }

    String deleteUser(User user) {
        if(userRepository.findByUid(user.userGoogleUid).isPresent()) {
            userRepository.delete(user);
            return "user deleted";
        } else {return "user does not exist";}
    }

    String checkUser(User user) {
        if (userRepository.findByUid(user.userGoogleUid).isPresent()) {
            return "user already exists";
        } else {return "user does not exist";}
    }

}
