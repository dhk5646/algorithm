package com.aks.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 멀리뛰기_테스트 {

    private final 멀리뛰기 instance = new 멀리뛰기();

    @Test
    public void testSolution1() {
        // given
        int n = 1;

        // when
        long actual = instance.solution(n);

        // then
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testSolution() {
        // given
        int n = 3;

        // when
        long actual = instance.solution(n);

        // then
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void testSolution2() {
        // given
        int n = 4;

        // when
        long actual = instance.solution(n);

        // then
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void testSolution3() {
        // given
        int n = 5;

        // when
        long actual = instance.solution(n);

        // then
        Assertions.assertEquals(8, actual);
    }

    @Test
    public void testSolution4() {
        // given
        int n = 6;

        // when
        long actual = instance.solution(n);

        // then
        Assertions.assertEquals(13, actual);
    }

    @Test
    public void testSolution5() {
        // given
        int n = 7;

        // when
        long actual = instance.solution(n);

        // then
        Assertions.assertEquals(21, actual);
    }

    @Test
    public void testSolution2000() {
        // given
        int n = 100;

        // when
        long actual = instance.solution(n);

        // then
        Assertions.assertEquals(496748, actual);
    }

}
