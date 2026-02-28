package com.example.aop.aop.services;

public interface ShipmentService {
    public String orderPackage(Long orderId);
    public String trackPackage(Long orderId);
}
