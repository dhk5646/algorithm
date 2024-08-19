package com.aks.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 귤_고르기_테스트 {

    private final 귤_고르기 instance = new 귤_고르기();

    @Test
    public void testCase1() {
        // given
        int k = 3;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        // when
        int expected = 3;
        int actual = instance.solution(k, tangerine);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        // given
        int k = 4;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        // when
        int expected = 4;
        int actual = instance.solution(k, tangerine);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        // given
        int k = 2;
        int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};

        // when
        int expected = 1;
        int actual = instance.solution(k, tangerine);

        // then
        Assertions.assertEquals(expected, actual);
    }
}
