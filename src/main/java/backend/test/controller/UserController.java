package backend.test.controller;


import backend.test.config.CustomResponse;
import backend.test.entity.UserEntity;
import backend.test.repository.UserRepository;
import backend.test.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;

import java.sql.Timestamp;
import java.util.List;


@RestController
@RequestMapping("/service")
@Tag(name = "app-controller")
public class UserController {

    private final UserRepository repository;
    private final UserService userService;

    @Autowired
    public UserController(UserRepository repository, UserService userService) {
        this.repository = repository;
        this.userService = userService;
    }


    @GetMapping("")
    public List<UserEntity> findAll() {
        return repository.findAll();
    }


    @PostMapping("/gettoken")
    public ResponseEntity<Object> getToken(@RequestBody UserEntity userEntity) {
        return userService.processToken(userEntity);
    }


}
