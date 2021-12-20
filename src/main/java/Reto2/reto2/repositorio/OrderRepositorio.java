/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto2.reto2.repositorio;

import Reto2.reto2.interfaces.InterfaceOrder;
import Reto2.reto2.modelo.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stive
 */
@Repository
public class OrderRepositorio {
    @Autowired
    private InterfaceOrder orderCrudRepository;

    public List<Order> getAll(){
        return orderCrudRepository.findAll();
    }

    public Optional<Order> getOrder(Integer id){
        return orderCrudRepository.findById(id);
    }

    public Order create(Order order){
        return orderCrudRepository.save(order);
    }

    public void update(Order order){
        orderCrudRepository.save(order);
    }

    public void delete(Order order){
        orderCrudRepository.delete(order);
    }

    public List<Order> getOrderByZone(String zone){
        return orderCrudRepository.findBySalesManZone(zone);
    }
}
