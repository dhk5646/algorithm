package com.aks.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 점프와_순간_이동_테스트 {

    private final 점프와_순간_이동 instance = new 점프와_순간_이동();

    @Test
    public void testSolution() {
        // given
        int n = 5;

        // when
        int expected = 2;
        int actual = instance.solution(n);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSolution2() {
        // given
        int n = 6;

        // when
        int expected = 2;
        int actual = instance.solution(n);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSolution3() {
        // given
        int n = 5000;

        // when
        int expected = 2;
        int actual = instance.solution(n);

        // then
        Assertions.assertEquals(expected, actual);
    }
}
