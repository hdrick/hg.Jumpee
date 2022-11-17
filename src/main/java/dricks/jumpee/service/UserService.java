package dricks.jumpee.service;

import dricks.jumpee.model.Role;
import dricks.jumpee.model.User;
import dricks.jumpee.repository.UserRepository;
import dricks.jumpee.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public User save(UserRegistrationDto registrationDto){
        User user = new User(registrationDto.getFirstName(),registrationDto.getLastName(),
                            registrationDto.getEmail(),registrationDto.getPassword(),
                Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }
}
