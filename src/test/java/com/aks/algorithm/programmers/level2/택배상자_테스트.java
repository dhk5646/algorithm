package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 택배상자_테스트 {

    private final 택배상자 instance = new 택배상자();

    @Test
    public void testSolution() {
        // given
        int[] order = {4, 3, 1, 2, 5};

        // when
        int actual = instance.solution(order);

        // then
        Assertions.assertEquals(2, actual);

    }

}
