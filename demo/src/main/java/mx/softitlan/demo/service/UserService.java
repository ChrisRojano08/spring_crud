package mx.softitlan.demo.service;

import mx.softitlan.utils.exception.AppException;
import org.springframework.web.client.HttpStatusCodeException;

import java.util.Map;

public interface UserService {
    boolean registerUser(Map<String, Object> data) throws AppException, HttpStatusCodeException;
}
