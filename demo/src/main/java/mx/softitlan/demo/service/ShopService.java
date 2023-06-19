package mx.softitlan.demo.service;

import mx.softitlan.utils.exception.AppException;

import java.util.Map;

public interface ShopService {
    boolean insertShop(Map<String, Object> data) throws AppException;
}
