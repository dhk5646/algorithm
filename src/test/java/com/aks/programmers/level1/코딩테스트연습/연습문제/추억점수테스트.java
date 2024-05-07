package com.aks.programmers.level1.코딩테스트연습.연습문제;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 추억점수테스트 {

    @Test
    public void testSolution() {
        // given
        String[] name = new String[] {"may", "kein", "kain", "radi"};
        int[] yearning = new int[] {5, 10, 1, 3};
        String[][] photo = new String[][] {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};
        int[] expected = new int[] {19, 15, 6};

        // when
        추억점수 level2 = new 추억점수();
        int[] actual = level2.solution(name, yearning, photo);

        // then
        Assertions.assertArrayEquals(expected, actual);

    }
}
