package mx.softitlan.demo.service.impl;

import mx.softitlan.demo.model.UserVO;
import mx.softitlan.demo.repository.UserRepository;
import mx.softitlan.demo.service.UserService;
import mx.softitlan.utils.Utils;
import mx.softitlan.utils.exception.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean registerUser(Map<String, Object> data) throws AppException {
        boolean registered = false;

        try {
            UserVO user = new UserVO();

            user.setName(data.get("name").toString());
            user.setBirthdate(new Date(data.get("birthdate").toString()));
            user.setPhone(data.get("phone").toString());

            userRepository.save(user);
            registered = true;
        }catch (Exception e){
            Utils.raise(e, "No se pudó insertar al usuario");
        }

        return registered;
    }
}
