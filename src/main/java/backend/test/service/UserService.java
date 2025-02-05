package backend.test.service;

import backend.test.entity.UserEntity;
import backend.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
@Service
public class UserService {

    @Autowired
    private UserRepository repository;



    public UserEntity repository(UserEntity userEntity) {
        return repository.save(userEntity);
    }
}
