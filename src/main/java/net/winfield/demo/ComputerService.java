package net.winfield.demo;

import java.math.BigDecimal;

public class ComputerService {

    public float plus(float a, float b) {
        return a + b;
    }

    public float minus(float a, float b) {
        return a - b;
    }

    public float multiple(float a, float b) {
        return a * b;
    }

    public String devide(float a, float b) {
        float result = a / b;
        BigDecimal bd = new BigDecimal(new Float(result).toString());
        String f1 = bd.setScale(1, BigDecimal.ROUND_HALF_UP).toString();
        return f1;
    }

    public float mod(float a, float b) {
        return a % b;
    }

    public float square(float a) {
        return a * a;
    }
}
