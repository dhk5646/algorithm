package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 이진_변환_반복하기_테스트 {

    private final 이진_변환_반복하기 instance = new 이진_변환_반복하기();

    @Test
    public void testCase() {
        // given
        String s = "110010101001";

        // when
        int[] expected = {3, 8};
        int[] actual = instance.solution(s);

        // then
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testCase2() {
        // given
        String s = "01110";

        // when
        int[] expected = {3, 3};
        int[] actual = instance.solution(s);

        // then
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testCase3() {
        // given
        String s = "1111111";

        // when
        int[] expected = {4, 1};
        int[] actual = instance.solution(s);

        // then
        Assertions.assertArrayEquals(expected, actual);

    }

}
