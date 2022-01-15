package pers.su.simplebean.service;


import pers.su.simplebean.entity.OrderDO;

import java.util.List;

public interface OrderService {

    void insert(OrderDO order);

    OrderDO get(int id);

    List<OrderDO> list();

    int count();

    void delete(int id);

    void update(int id);

}
