package cn.avrilft.spring.security.user.service;

import cn.avrilft.spring.security.user.entity.User;

public interface UserServices {

    User getUserByName(String name);

}
