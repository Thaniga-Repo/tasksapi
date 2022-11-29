package com.taskman.mytasks.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;

public interface CountriesService {
    @Retryable(value = {ArithmeticException.class}, maxAttempts = 3, backoff = @Backoff(200))
    double retryMethod(int val);
}
