package com.chunchun.twitchrecommend.service;

import com.chunchun.twitchrecommend.dao.RegisterDao;
import com.chunchun.twitchrecommend.entity.db.User;
import com.chunchun.twitchrecommend.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RegisterService {
    @Autowired
    private RegisterDao registerDao;

    public boolean register(User user) throws IOException {
        user.setPassword(Util.encryptPassword(user.getUserId(), user.getPassword()));
        return registerDao.register(user);
    }

}
