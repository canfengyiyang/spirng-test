package pers.su.simplebean.service.impl;

import org.springframework.stereotype.Service;
import pers.su.simplebean.service.OrderService;
import pers.su.simplebean.service.entity.OrderDO;


import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    public void insert(OrderDO order) {
        System.out.println("添加订单成功");
    }

    public OrderDO get(int id) {
        System.out.println("获取订单 id = " + id);
        return new OrderDO(id, "订单1", 1);
    }

    public List<OrderDO> list() {
        System.out.println("获取全部订单");

        List<OrderDO> orderList = new ArrayList<OrderDO>();
        for (int i = 0; i < 2; i++) {
            orderList.add(new OrderDO(i, "订单1", i));
        }
        return orderList;
    }

    public int count() {
        System.out.println("查询总数量");
        return 5;
    }

    public void delete(int id) {
        System.out.println("删除订单 id = " + id);

    }

    public void update(int id) {
        System.out.println("更新订单 id = " + id);

    }
}
