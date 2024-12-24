package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 연속_부분_수열_합의_개수_테스트 {

    private final 연속_부분_수열_합의_개수 instance = new 연속_부분_수열_합의_개수();

    @Test
    public void testCase() {
        // given
        int[] elements = {7, 9, 1, 1, 4};

        // when
        int actual = instance.solution(elements);

        // then
        Assertions.assertEquals(18, actual);

    }

    @Test
    public void testCase2() {
        // given
        int[] elements = {7, 9, 1};

        // when
        int actual = instance.solution(elements);

        // then
        Assertions.assertEquals(7, actual);

    }

}
