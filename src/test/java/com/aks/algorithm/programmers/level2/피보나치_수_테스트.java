package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 피보나치_수_테스트 {

    private final 피보나치_수 instance = new 피보나치_수();

    @Test
    public void testSolution() {
        // given
        int n = 3;

        // when
        int expected = 2;
        int actual = instance.solution(n);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSolution2() {
        // given
        int n = 5;

        // when
        int expected = 5;
        int actual = instance.solution(n);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSolution3() {
        // given
        int n = 1500;

        // when
        int expected = 1058440;
        int actual = instance.solution(n);

        // then
        Assertions.assertEquals(expected, actual);
    }
}
