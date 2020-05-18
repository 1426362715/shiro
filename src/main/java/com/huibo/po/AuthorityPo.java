package com.huibo.po;

import lombok.Data;

/**
 * @ClassName AuthorityPo 权限实体
 * @Author Administrator
 * @Data 自动生成get、set、构造方法
 * @Date 2020/5/16
 **/
@Data
public class AuthorityPo {
    /**
     * authorityId 权限id
     */
    private Integer authorityId;
    /**
     * authorityName 权限名称
     */
    private String authorityName;
    /**
     * authorityMessage 权限描述
     */
    private String authorityMessage;
}
