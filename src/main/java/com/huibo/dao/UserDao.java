package com.huibo.dao;

import com.huibo.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserDao 用户登录dao层
 * @Author Administrator
 * @Date 2020/5/16
 **/
@Mapper
public interface UserDao {
    /**
     * 通过用户名查询用户信息
     * @param userName 用户名
     * @return 查询到的用户信息
     */
    public UserPo getUser(String userName);

}
