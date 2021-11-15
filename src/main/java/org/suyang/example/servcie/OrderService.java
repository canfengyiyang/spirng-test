package org.suyang.example.servcie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.suyang.example.dao.UserDao;

@Service
public class OrderService {


    private UserDao userDao;

    @Autowired
    private void setUserDao(UserDao userDao) {

        this.userDao = userDao;

        System.out.println("调用 方法：：：：：：：：：：：");
    }


    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }


//    private List<UserService> userServiceList;
//
//    public OrderService(List<UserService> userServiceList) {
//        System.out.println("有参构造");
//        this.userServiceList = userServiceList;
//    }
//
//    public void test() {
//        System.out.println("userServiceList:" + userServiceList);
//    }

}
