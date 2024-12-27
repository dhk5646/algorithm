package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 가장_큰_정사각형_찾기_테스트 {

    private final 가장_큰_정사각형_찾기 instance = new 가장_큰_정사각형_찾기();

    @Test
    public void testCase() {
        // given
        int[][] board = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 0, 1, 0}, {0, 0, 1, 0}};

        // when
        int actual = instance.solution(board);

        // then
        Assertions.assertEquals(4, actual);
    }

    @Test
    public void testCase2() {
        // given
        int[][] board = {{0, 0, 1, 1}, {1, 1, 1, 1}};

        // when
        int actual = instance.solution(board);

        // then
        Assertions.assertEquals(4, actual);
    }

    @Test
    public void testCase3() {
        // given
        int[][] board = {{0}, {0}};

        // when
        int actual = instance.solution(board);

        // then
        Assertions.assertEquals(0, actual);
    }


    @Test
    public void testCase4() {
        // given
        int[][] board = {{0}, {1}};

        // when
        int actual = instance.solution(board);

        // then
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testCase5() {
        // given
        int[][] board = {{1, 0}, {0, 0}, {0, 0}};

        // when
        int actual = instance.solution(board);

        // then
        Assertions.assertEquals(1, actual);
    }
}
