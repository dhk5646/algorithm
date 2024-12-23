package com.aks.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 주차_요금_계산_테스트 {

    private final 주차_요금_계산 instance = new 주차_요금_계산();

    @Test
    public void testSolution() {
        // given
        int[] fees = {180, 5000, 10, 600};
        String[] records = {
                "05:34 5961 IN",
                "06:00 0000 IN",
                "06:34 0000 OUT",
                "07:59 5961 OUT",
                "07:59 0148 IN",
                "18:59 0000 IN",
                "19:09 0148 OUT",
                "22:59 5961 IN",
                "23:00 5961 OUT"
        };


        // when
        int[] expected = {14600, 34400, 5000};
        int[] actual = instance.solution(fees, records);

        // then
        Assertions.assertArrayEquals(expected, actual);

    }
}
