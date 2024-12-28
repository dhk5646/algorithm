package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 피로도_테스트 {

    private final 피로도 instance = new 피로도();

    @Test
    public void testSolution1() {
        // given
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        // when
        int actual = instance.solution(k, dungeons);

        // then
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void testSolution2() {
        // given
        int k = 80;
        int[][] dungeons = {{50, 40}, {30, 10}, {80, 20}}; // 3 2 1

        // when
        int actual = instance.solution(k, dungeons);

        // then
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void testSolution3() {
        // given
        int k = 100;
        int[][] dungeons = {{20, 20}, {50, 20}, {90, 60}};

        // when
        int actual = instance.solution(k, dungeons);

        // then
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void testSolution4() {
        // given
        int k = 80;
        int[][] dungeons = {{100, 80}};

        // when
        int actual = instance.solution(k, dungeons);

        // then
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testSolution5() {
        // given
        int k = 80;
        int[][] dungeons = {{80, 80}};

        // when
        int actual = instance.solution(k, dungeons);

        // then
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testSolution6() {
        // given
        int k = 10;
        int[][] dungeons = {{80, 10}, {10, 10}};

        // when
        int actual = instance.solution(k, dungeons);

        // then
        Assertions.assertEquals(1, actual);
    }

}
