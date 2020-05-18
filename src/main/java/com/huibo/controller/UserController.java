package com.huibo.controller;

import com.huibo.po.UserPo;
import com.huibo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试
 * @author Administrator
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 测试方法
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }

    /**
     * 测试Thymeleaf
     * @param model
     * @return
     */
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(Model model){
        //把数据存入model
        model.addAttribute("name","测试");
        //返回index页面
        return "index";
    }

    /**
     * 跳转到主页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "user/add";
    }

    /**
     * 跳转到更新页面
     * @return
     */
    @RequestMapping("/toUpdate")
    public String toUpdate(){
        return "user/update";
    }

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    /**
     * 跳转到为授权页面
     * @return
     */
    @RequestMapping("/unAuth")
    public String unAuth(){
        return "unAuth";
    }

    /**
     * 用户登录逻辑处理
     * @param userPo 用户表单信息
     * @return
     */
    @RequestMapping("login")
    public String login(UserPo userPo,Model model){
        /**
         * 使用shiro编写认证操作
         */
        //1.获取Subject
        Subject subject = SecurityUtils.getSubject();

        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(userPo.getUserName(),userPo.getPassword());
        System.out.println("用户名："+token.getUsername()+"---密码："+token.getPassword());
        //3.执行登录方法
        try {
            subject.login(token);
            //登录成功
            return "redirect:/index";
        }catch (UnknownAccountException e){
            //登录失败：用户名不存在
            model.addAttribute("msg","用户名不存在");
            //返回登录页面
            return "toLogin";
        }catch (IncorrectCredentialsException e){
            //登录失败：密码错误
            model.addAttribute("msg","密码错误");
            //返回登录页面
            return "toLogin";
        }
    }
}
