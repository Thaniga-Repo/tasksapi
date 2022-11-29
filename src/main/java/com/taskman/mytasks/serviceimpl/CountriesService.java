package com.taskman.mytasks.serviceimpl;

import org.springframework.retry.annotation.Recover;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CountriesService implements com.taskman.mytasks.service.CountriesService {
    static int divideBy = 0;

    @Override
    public double retryMethod(int val) throws ArithmeticException {
        double result = 0.0;
        System.out.println("Trying to divide by " + divideBy);
        try {
            result = val / divideBy;
        }catch (ArithmeticException e)    {
            System.out.println("Exception - " + e.getMessage());
            divideBy = 2;
            throw new ArithmeticException();
        }

        System.out.println("Printing the result - " + result);
        return result;
    }
}
