package net.winfield.demo;

import java.math.BigDecimal;

public class ComputerService {

    public String plus(float a, float b) {
        return String.valueOf(a + b);
    }

    public String minus(float a, float b) {
        return String.valueOf(a - b);
    }

    public String multiple(float a, float b) {
        return String.valueOf(a * b);
    }

    public String devide(float a, float b) {
        float floatResult = a / b;
        BigDecimal bd = new BigDecimal(Float.toString(floatResult));
        return bd.setScale(1, BigDecimal.ROUND_HALF_UP).toString();
    }

    public String mod(float a, float b) {
        return String.valueOf(a % b);
    }

    public String square(float a) {
        return String.valueOf(a * a);
    }

    public String cublic(float a) {
        return String.valueOf(a * a * a);
    }

    public String power(float a, int b) {
        return String.valueOf(Math.pow(a, b));
    }
}
