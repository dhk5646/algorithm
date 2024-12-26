package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JadenCase_문자열_만들기_테스트 {

    private final JadenCase_문자열_만들기 instance = new JadenCase_문자열_만들기();

    @Test
    public void testSolution() {
        // given
        String s = "3people unFollowed me";

        // when
        String expected = "3people Unfollowed Me";
        String actual = instance.solution(s);

        // then
        Assertions.assertEquals(expected, actual);

    }
}
