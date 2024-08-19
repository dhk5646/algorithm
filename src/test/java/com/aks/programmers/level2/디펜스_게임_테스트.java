package com.aks.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 디펜스_게임_테스트 {

    private final 디펜스_게임 instance = new 디펜스_게임();

    @Test
    public void testCase() {
        // given
        int n = 7;
        int k = 3;
        int[] enemy = {4,2,4,5,3,3,1};

        // when
        int expected = 5;
        int actual = instance.solution(n, k, enemy);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        // given
        int n = 2;
        int k = 4;
        int[] enemy = {3,3,3,3};

        // when
        int expected = 4;
        int actual = instance.solution(n, k, enemy);

        // then
        Assertions.assertEquals(expected, actual);
    }
}
