package org.suyang.example.servcie.impl;

import org.springframework.stereotype.Service;
import org.suyang.example.servcie.Calculator;

@Service
public class MyCalculator implements Calculator {
    public int add(int i, int j) {
        return i + j;
    }

    public int subtract(int i, int j) {
        return i - j;
    }

    public int multiply(int i, int j) {
        return i * j;
    }

    public int divide(int i, int j) {
        return i / j;
    }
}
