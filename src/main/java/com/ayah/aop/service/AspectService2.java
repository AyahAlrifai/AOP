package com.ayah.aop.service;

import com.ayah.aop.annotation.Test;
import org.springframework.stereotype.Service;

@Service
public class AspectService2 implements AspectService {
    
    public String test1(String firstName, String lastName) {
        System.out.println("AspectService2 -> test1 -> " + firstName + " " + lastName);
        return firstName + " " + lastName;
    }

    @Test()
    public Integer test2(Integer num1, Integer num2) {
        System.out.println("AspectService2 -> test2 -> " + (num1 + num2));
        return num1 + num2;
    }
}
