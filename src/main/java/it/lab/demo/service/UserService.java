package it.lab.demo.service;

import it.lab.demo.model.UserDto;
import it.lab.demo.repository.entity.User;
import it.lab.demo.repository.jpa.UserRepository;
import it.lab.demo.repository.mapper.UserMapper;
import java.util.List;
import java.util.Optional;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public UserDto saveUser(UserDto userDto) {
        log.info("Save user");
        log.debug("user = {}", userDto);
        return userMapper.map(userRepository.save(userMapper.map(userDto)));
    }

    public UserDto getUser(Integer userId) {
        log.info("Search user by ID [{}]", userId);
        Optional<User> user = userRepository.findById(userId);

        return user.map(userMapper::map).orElse(null);
    }

    public List<UserDto> getUsers() {
        log.info("Search all users");
        return userMapper.map(userRepository.findAll());
    }
}