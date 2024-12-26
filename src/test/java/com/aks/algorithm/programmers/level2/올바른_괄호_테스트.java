package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 올바른_괄호_테스트 {

    private final 올바른_괄호 instance = new 올바른_괄호();

    @Test
    public void testSolution() {
        // given
        String s = "()()";

        // when
        boolean actual = instance.solution(s);

        // then
        Assertions.assertTrue(actual);

    }

    @Test
    public void testSolution2() {
        // given
        String s = "(())()";

        // when
        boolean actual = instance.solution(s);

        // then
        Assertions.assertTrue(actual);

    }

    @Test
    public void testSolution3() {
        // given
        String s = ")()(";

        // when
        boolean actual = instance.solution(s);

        // then
        Assertions.assertFalse(actual);

    }

    @Test
    public void testSolution4() {
        // given
        String s = "(()(";

        // when
        boolean actual = instance.solution(s);

        // then
        Assertions.assertFalse(actual);

    }
}
