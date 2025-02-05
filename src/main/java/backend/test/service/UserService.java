package backend.test.service;

import backend.test.config.CustomResponse;
import backend.test.entity.UserEntity;
import backend.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Field;
@Service
public class UserService {

    @Autowired
    private UserRepository repository;



    public ResponseEntity<Object> processToken(UserEntity userEntity) {
        try {
            if (userEntity.getRequestDate() == null) {
                userEntity.setRequestDate(new Timestamp(System.currentTimeMillis()));
            }

            System.out.println("Received: " + userEntity);


            Map<String, String> errorData = new HashMap<>();
            for (Field field : UserEntity.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object value = field.get(userEntity);
                boolean isStrEmpty = value instanceof String && ((String) value).trim().isEmpty();
                if (value == null || isStrEmpty) {
                    errorData.put(field.getName(), "ช่องนี้ยังไม่ได้กรอกข้อมูล");
                }
            }

            if (!errorData.isEmpty()) {
                return CustomResponse.responseBuilder(
                        "ไม่พบข้อมูลการ POST",
                        HttpStatus.BAD_REQUEST,
                        errorData
                );
            }


            repository.save(userEntity);

            Map<String, String> responseData = new HashMap<>();
            responseData.put("userId", userEntity.getUserid());
            responseData.put("tokenId", userEntity.getTokenid());

            return CustomResponse.responseBuilder("ทำรายการเรียบร้อย", HttpStatus.OK, responseData);

        } catch (Exception e) {
            Map<String, String> errorData = new HashMap<>();
            errorData.put("userId", null);
            errorData.put("tokenId", null);

            return CustomResponse.responseBuilder(
                    "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้",
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    errorData
            );
        }
    }
}
