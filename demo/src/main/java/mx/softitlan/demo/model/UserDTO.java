package mx.softitlan.demo.model;

import java.util.Date;

public class UserDTO {
    private Integer id;
    private String name;
    private String phone;
    private Date birthDate;

    public UserDTO(String name, String phone, Date birthDate) {
        this.name = name;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    public UserDTO(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
