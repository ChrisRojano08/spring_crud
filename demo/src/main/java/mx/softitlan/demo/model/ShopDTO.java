package mx.softitlan.demo.model;

import java.util.Date;

public class ShopDTO {
    private Integer id;
    private UserVO user;
    private Date shop_date;
    private double amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserVO getUser() {
        return user;
    }

    public void setUser(UserVO user) {
        this.user = user;
    }

    public Date getShop_date() {
        return shop_date;
    }

    public void setShop_date(Date shop_date) {
        this.shop_date = shop_date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
