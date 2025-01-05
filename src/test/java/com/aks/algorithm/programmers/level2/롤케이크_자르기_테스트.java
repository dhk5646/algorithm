package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 롤케이크_자르기_테스트 {

    private final 롤케이크_자르기 instance = new 롤케이크_자르기();

    @Test
    public void testSolution1() {
        // given
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};

        // when
        long actual = instance.solution(topping);

        // then
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void testSolution2() {
        // given
        int[] topping = {1, 2, 3, 1, 4};

        // when
        long actual = instance.solution(topping);

        // then
        Assertions.assertEquals(0, actual);
    }
}
