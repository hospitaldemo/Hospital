package com.neuedu.hospital.ServiceImpl;

import com.neuedu.hospital.mapper.LoginMapper;
import com.neuedu.hospital.pojo.Login;
import com.neuedu.hospital.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    private LoginMapper loginMapper;
    @Override
    public Login login(Login login) {
        return loginMapper.selectByLogin(login);
    }
}
