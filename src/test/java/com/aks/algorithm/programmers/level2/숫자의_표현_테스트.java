package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 숫자의_표현_테스트 {

    private final 숫자의_표현 instance = new 숫자의_표현();

    @Test
    public void testSolution() {
        // given
        int n = 15;

        // when
        int expected = 4;
        int actual = instance.solution(n);

        // then
        Assertions.assertEquals(expected, actual);

    }
}
