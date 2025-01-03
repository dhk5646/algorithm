package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 괄호_회전하기_테스트 {

    private final 괄호_회전하기 instance = new 괄호_회전하기();

    @Test
    public void testSolution1() {
        // given
        String s = "[](){}";

        // when
        long actual = instance.solution(s);

        // then
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void testSolution2() {
        // given
        String s = "}]()[{";

        // when
        long actual = instance.solution(s);

        // then
        Assertions.assertEquals(2, actual);
    }

    @Test
    public void testSolution3() {
        // given
        String s = "[)(]";

        // when
        long actual = instance.solution(s);

        // then
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testSolution4() {
        // given
        String s = "}}}";

        // when
        long actual = instance.solution(s);

        // then
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void testSolution5() {
        // given
        String s = "{[}]";

        // when
        long actual = instance.solution(s);

        // then
        Assertions.assertEquals(0, actual);
    }
}
