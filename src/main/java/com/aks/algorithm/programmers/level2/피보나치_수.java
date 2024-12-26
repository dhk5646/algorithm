package com.aks.algorithm.programmers.level2;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12945?language=java
 */
public class 피보나치_수 {
    public int solution(int n) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);

        int divisor = 1234567; // 나눌 값

        for (int i = 2; i <= n; i++) {
            int n2 = numbers.get(i - 2) % divisor; // F(n-2)
            int n1 = numbers.get(i - 1) % divisor; // F(n-1)

            numbers.add(n2 + n1); // F(n)
        }

        return numbers.get(n) % divisor;
    }

}
