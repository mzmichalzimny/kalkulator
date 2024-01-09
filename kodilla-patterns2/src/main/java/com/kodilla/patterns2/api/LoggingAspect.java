package com.kodilla.patterns2.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.kodilla.patterns2.api.OrderFacade.processOrder(..))")
    public void logBeforeProcessOrder() {
        System.out.println("Metoda processOrder() została wywołana.");
    }
}