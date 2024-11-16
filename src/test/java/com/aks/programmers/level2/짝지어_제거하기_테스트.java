package com.aks.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 짝지어_제거하기_테스트 {

    private final 짝지어_제거하기 instance = new 짝지어_제거하기();

    @Test
    public void testSolution() {
        // given
        String s = "baabaa";

        // baab
        // xooo

        // bb

        // when
        int expected = 1;
        int actual = instance.solution(s);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSolution2() {
        // given
        String s = "cdcd";

        // when
        int expected = 0;
        int actual = instance.solution(s);

        // then
        Assertions.assertEquals(expected, actual);
    }
}
