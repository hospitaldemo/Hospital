package com.neuedu.hospital.controller;

import com.neuedu.hospital.pojo.Login;
import com.neuedu.hospital.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping(value="/userlogin",method = RequestMethod.GET)
    public Login login(@RequestBody Login login){
        //请求中传递json格式的对象，转为java中的对象
        return loginService.login(login);
    }
}
