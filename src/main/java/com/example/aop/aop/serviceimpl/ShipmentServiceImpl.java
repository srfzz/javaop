package com.example.aop.aop.serviceimpl;

import com.example.aop.aop.services.ShipmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ShipmentServiceImpl implements ShipmentService {
    @Override
    public String orderPackage(Long orderId) {
        try{
            log.info("processing the order");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }
        return "success:orderId:"+orderId;
    }

    @Override
    public String trackPackage(Long orderId) {
     try{
         log.info("Tracking the order");
         Thread.sleep(500);
            throw new RuntimeException("Exception Occured During Trck Package");
     }catch (InterruptedException   e){
        throw new RuntimeException(e.getMessage());
     }

    }
}
