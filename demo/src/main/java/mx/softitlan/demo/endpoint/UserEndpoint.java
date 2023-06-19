package mx.softitlan.demo.endpoint;

import mx.softitlan.demo.model.UserDTO;
import mx.softitlan.demo.service.UserService;
import mx.softitlan.utils.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import mx.softitlan.utils.Utils;

import java.util.Map;

@RequestMapping("user")
@RestController
public class UserEndpoint {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @CrossOrigin
    public ResponseEntity<ResponseBody<Void>> registerNewUser(@RequestBody() Map<String, Object> data) {
        ResponseEntity<ResponseBody<Void>> res = null;
        try {
            if (userService.registerUser(data)){
                res = Utils.<Void>response200OK("Se ha registrado al usuario!");
            }
        }catch (Exception e){
            res = Utils.<Void>handle(e, "Ocurrió un error al insertar al usuario");
        }
        return res;
    }

}
