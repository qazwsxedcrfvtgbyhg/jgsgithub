package cn.kgc.bean.mapper;

import cn.kgc.bean.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    //注解版
    //查询总记录数
    @Select("select count(1) from smbms_user")
    Integer getAll();

    //查询全部
    @Select("select * from smbms_user")
    List<User> wjx();
}
