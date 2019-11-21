package cn.star.cn.star.controller;

import cn.star.domain.Users;
import cn.star.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: qitong
 * @Date: 2019/11/21 21:39
 */
@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("/findUsers")
    public String findUsers(Model model){
        System.out.println("表现层：用户查询");
        //调用测试
        List<Users> list = usersService.findAllUser();
        model.addAttribute("list",list);
        return "users";
    }
    @RequestMapping("/login/insert")
public String loginUsers(Users users){
    System.out.println("注册");
    usersService.loginInsert(users);
    return "success";

}
    @RequestMapping("/login")
    public String login(Users users) {
        System.out.println("登录");
        // 调用注入的 usersService 调用 login 方法
        if(usersService.login(users)){
            return "successlogin";
        }else{
            return "falselogin";
        }
    }
}
