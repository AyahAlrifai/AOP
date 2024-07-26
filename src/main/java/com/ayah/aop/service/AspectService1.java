package com.ayah.aop.service;

import com.ayah.aop.annotation.Test;
import org.springframework.stereotype.Service;

@Service
public class AspectService1 implements AspectService {

    @Test()
    public String test1(String firstName, String lastName) {
        System.out.println("AspectService1 -> test1 -> " + firstName + " " + lastName);
        return firstName + " " + lastName;
    }

    public Integer test2(Integer num1, Integer num2) {
        System.out.println("AspectService1 -> test2 -> " + (num1 + num2));
        return num1 + num2;
    }
}
