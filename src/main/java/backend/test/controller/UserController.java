package backend.test.controller;


import backend.test.config.CustomResponse;
import backend.test.entity.UserEntity;
import backend.test.repository.UserRepository;
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

    @Autowired
    public UserController(UserRepository repositotyapitest) {
      this.repository = repositotyapitest;
    }

    @GetMapping("")
    public List<UserEntity> findAll() {
        return repository.findAll();
    }


    @PostMapping("/gettoken")
    public ResponseEntity<Object> getToken(@RequestBody UserEntity userEntity) {
        if (userEntity.getRequestDate() == null) {
            userEntity.setRequestDate(new Timestamp(System.currentTimeMillis()));
        }

        System.out.println("Received: " + userEntity);

        Map<String, String> responseData = new HashMap<>();
        responseData.put("userId", userEntity.getUserid());
        responseData.put("tokenId", userEntity.getTokenid());


        return CustomResponse.responseBuilder("ทำรายการเรียบร้อย", HttpStatus.OK, responseData);
    }

}
