package com.ayah.aop.initializer;

import com.ayah.aop.service.AspectService1;
import com.ayah.aop.service.AspectService2;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class AspectTestInitializer implements CommandLineRunner {

    private final AspectService1 aspectService1;
    private final AspectService2 aspectService2;

    @Override
    public void run(String... args) throws Exception {

        aspectService1.test1("Ayah","Al-Refai");
        aspectService1.test2(7,5);

        aspectService2.test1("Al-Refai","Ayah");
        aspectService2.test2(2,8);
    }
}
