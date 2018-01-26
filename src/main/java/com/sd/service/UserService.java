package com.sd.service;

import com.sd.Entity.RegisterEntity;
import com.sd.dao.UserDAO;
import com.sd.model.RegisterModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("UserService")
//@Scope("singleton")
public class UserService implements IUserService{

    @Autowired
    private UserDAO userDAO;

    @Override
    public String saveRegistration(RegisterModel registerModel) {
        RegisterEntity registerEntity=new RegisterEntity();
        BeanUtils.copyProperties(registerModel,registerEntity);
        userDAO.save(registerEntity);
        return "success";
    }
}
