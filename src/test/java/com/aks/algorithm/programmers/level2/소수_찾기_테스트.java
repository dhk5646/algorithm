package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 소수_찾기_테스트 {

    private final 소수_찾기 instance = new 소수_찾기();

    @Test
    public void testSolution1() {
        // given
        String numbers = "17";

        // when
        int actual = instance.solution(numbers);

        // then
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void testSolution2() {
        // given
        String numbers = "011";

        // when
        int actual = instance.solution(numbers);

        // then
        Assertions.assertEquals(2, actual);
    }
}
