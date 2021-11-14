package org.suyang.example.servcie;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
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
