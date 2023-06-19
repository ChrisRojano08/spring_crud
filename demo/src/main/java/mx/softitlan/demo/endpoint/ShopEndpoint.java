package mx.softitlan.demo.endpoint;

import mx.softitlan.demo.service.ShopService;
import mx.softitlan.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mx.softitlan.utils.ResponseBody;

import java.util.Map;

@RestController
@RequestMapping("shop")
public class ShopEndpoint {
    @Autowired
    private ShopService shopService;

    @PostMapping("/insert")
    public ResponseEntity<ResponseBody<Void>> insertShop(@RequestBody() Map<String, Object> data){
        ResponseEntity<ResponseBody<Void>> res;

        try{
            boolean response = shopService.insertShop(data);

            if(response){
                res = Utils.<Void>response200OK(true, "Compra insertada!");
            }else{
                res = Utils.<Void>response200OK(false, "No se pudo insertar la compra");
            }
        }catch (Exception e){
            res = Utils.<Void>handle(e,"Ocurrió un error al insertar la compra");
        }

        return res;
    }
}
