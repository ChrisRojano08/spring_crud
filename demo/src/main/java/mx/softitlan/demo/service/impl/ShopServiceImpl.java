package mx.softitlan.demo.service.impl;

import mx.softitlan.demo.model.ShopVO;
import mx.softitlan.demo.repository.ShopRepository;
import mx.softitlan.demo.repository.UserRepository;
import mx.softitlan.demo.service.ShopService;
import mx.softitlan.utils.Utils;
import mx.softitlan.utils.exception.AppException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ShopServiceImpl implements ShopService {
    private static final Logger LOG = LoggerFactory.getLogger(ShopServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    ShopRepository shopRepository;

    @Override
    public boolean insertShop(Map<String, Object> data) throws AppException {
        boolean inserted = false;

        try{
            ShopVO shop = new ShopVO();

            shop.setShop_date(new Date(data.get("shop_date").toString()));
            shop.setUser(userRepository.getOne( Integer.parseInt(data.get("id_user").toString()) ));

            List<Double> amtList = new ArrayList( (List<Double>) data.get("amntList") );
            Double finalAmt = amtList.stream().mapToDouble(Double::valueOf).sum();

            shop.setAmount(finalAmt);

            shopRepository.save(shop);
            inserted = true;
        }catch (ClassCastException ce){
            Utils.raise(ce, "Las cantidades no tienen el formato correcto");
        }catch (Exception e){
            Utils.raise(e, "Error");
        }

        return inserted;
    }

}
