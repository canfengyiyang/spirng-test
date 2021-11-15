package org.suyang.example.servcie.impl;

import org.springframework.stereotype.Service;
import org.suyang.example.servcie.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void test() {
        System.out.println("UserServiceImpl");
    }
}
