package backend.test.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class CustomResponse {

    public static ResponseEntity<Object> responseBuilder(
    String message, HttpStatus status, Object responseObject
    )
    {
        Map<String, Object> response =  new HashMap<>();
        response.put("responseMessage", message);
        response.put("responseCode", status.value());
        response.put("responseData", responseObject);

        return new ResponseEntity<>(response, status);
    }
}
