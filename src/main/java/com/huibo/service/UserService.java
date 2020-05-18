package com.huibo.service;

import com.huibo.dao.UserDao;
import com.huibo.po.UserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService 用户登录逻辑处理层
 * @Author Administrator
 * @Date 2020/5/16
 **/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 通过用户名查询用户信息
     * @param userPo 用户名
     * @return 通过用户名查询到的用户信息
     */
    public UserPo findUser(String userName){
        return userDao.getUser(userName);
    }
}
