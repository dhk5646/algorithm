package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 타겟_넘버_테스트 {

    private final 타겟_넘버 instance = new 타겟_넘버();

    @Test
    public void testSolution() {
        // given
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        // when
        int actual = instance.solution(numbers, target);

        // then
        Assertions.assertEquals(5, actual);
    }

    
}
