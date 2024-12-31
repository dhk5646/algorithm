package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 게임_맵_최단거리_테스트 {

    private final 게임_맵_최단거리 instance = new 게임_맵_최단거리();

    @Test
    public void testSolution1() {
        // given
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};

        // when
        int actual = instance.solution(maps);

        // then
        Assertions.assertEquals(11, actual);

    }
}
