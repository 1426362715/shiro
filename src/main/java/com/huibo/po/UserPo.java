package com.huibo.po;

import lombok.Data;
/**
 *@ClassName UserPo 用户实体
 * @author Administrator
 * @Data 自动生成get、set、构造方法
 * @EqualsAndHashCode(callSuper=false) 禁止生成的方法中调用父类的方法
 * @Date 2020/5/16
 */
@Data
public class UserPo {
    /**
     * userId 用户id
     */
    private Integer userId;
    /**
     * userName 用户名
     */
    private String userName;
    /**
     * password 密码
     */
    private String password;
    /**
     * authorityId 权限id
     */
    private Integer authorityId;
}
