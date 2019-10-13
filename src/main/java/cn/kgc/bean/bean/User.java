package cn.kgc.bean.bean;


import lombok.Data;

import java.util.Date;

@Data
public class User {


    private Integer id;
    private String userCode;
    private String userName;
    private String userPassword;
    private Integer gender;
    private Date birthday;
    private String phone;
    private String address;
    private Integer userRole;
    private Integer createdBy;
    private Date creationDate;
    private Integer modifyBy;
    private Date modifyDate;
    private String idPicPath;
    private String workPicPath;

}
