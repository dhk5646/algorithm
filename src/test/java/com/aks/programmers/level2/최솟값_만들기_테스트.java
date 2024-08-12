package com.aks.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 최솟값_만들기_테스트 {

    private final 최솟값_만들기 instance = new 최솟값_만들기();

    @Test
    public void testSolution() {
        // given
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        // when
        int expected = 29;
        int actual = instance.solution(A, B);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSolution2() {
        // given
        int[] A = {1, 2};
        int[] B = {3, 4};

        // when
        int expected = 10;
        int actual = instance.solution(A, B);

        // then
        Assertions.assertEquals(expected, actual);
    }
}
