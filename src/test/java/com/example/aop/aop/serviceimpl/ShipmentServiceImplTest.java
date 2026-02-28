package com.example.aop.aop.serviceimpl;

import com.example.aop.aop.services.ShipmentService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j

class ShipmentServiceImplTest {
    @Autowired
    private  ShipmentServiceImpl shipmentServiceImpl;

    @Test
    void orderPackage() {
shipmentServiceImpl.orderPackage(1L);
    }

    @Test
    void trackPackage() {
        shipmentServiceImpl.trackPackage(1L);
    }
}