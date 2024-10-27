package com.GREENO.dto;

<<<<<<< HEAD:GL_Backend/src/main/java/com/agropharm/dto/OrderDTO.java
import com.agropharm.Entities.enums.OrderStatus;
import com.agropharm.mapper.DTOEntity;
=======
import com.GREENO.domain.enums.OrderStatus;
import com.GREENO.mapper.DTOEntity;
>>>>>>> de9fc5b09f3308f3c484e231cf77dd7f463a83c3:GL_Backend/src/main/java/com/GREENO/dto/OrderDTO.java

import java.sql.Timestamp;
import java.util.List;

public class OrderDTO implements DTOEntity {
    public Integer id;
    public Timestamp date;
    public UserDTO client;
    public UserDTO deliverer;
    public OrderStatus status;
    public List<OrderItemDTO> orderItems;
    public AddressDTO address;
    public double totalPrice;

    public OrderDTO(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public UserDTO getClient() {
        return client;
    }

    public void setClient(UserDTO client) {
        this.client = client;
    }

    public UserDTO getDeliverer() {
        return deliverer;
    }

    public void setDeliverer(UserDTO deliverer) {
        this.deliverer = deliverer;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItemDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (OrderItemDTO i: orderItems)
            totalPrice = totalPrice + i.getPrice();
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }
}