package com.aks.programmers.level2.코딩테스트연습.연습문제;

import com.aks.programmers.level1.코딩테스트연습.연습문제.추억점수;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 최댓값과최솟값테스트 {

    @Test
    public void testSolution() {
        // given
        최댓값과최솟값 instance = new 최댓값과최솟값();

        // when
        String expected = "1 6";
        String actual = instance.solution("1 2 3 4 5 6");

        // then
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSolution2() {
        // given
        최댓값과최솟값 instance = new 최댓값과최솟값();

        // when
        String expected = "-4 -1";
        String actual = instance.solution("-1 -2 -3 -4");

        // then
        Assertions.assertEquals(expected, actual);

    }
}
