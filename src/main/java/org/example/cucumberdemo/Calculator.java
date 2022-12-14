package org.example.cucumberdemo;

import java.util.List;

public class Calculator {

    public int add(Integer number1, int number2) {
        return number1 + number2;
    }

    public int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public int add(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }
}
