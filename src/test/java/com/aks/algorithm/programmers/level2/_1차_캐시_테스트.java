package com.aks.algorithm.programmers.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _1차_캐시_테스트 {

    private final _1차_캐시 instance = new _1차_캐시();

    @Test
    public void testSolution() {
        // given
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        // when
        int actual = instance.solution(cacheSize, cities);

        // then
        Assertions.assertEquals(50, actual);
    }

    @Test
    public void testSolution2() {
        // given
        int cacheSize = 3;
        String[] cities = {"a", "b", "a", "c", "d", "a"};

        // when
        int actual = instance.solution(cacheSize, cities);

        // then
        Assertions.assertEquals(22, actual);
    }

    @Test
    public void testSolution3() {
        // given
        int cacheSize = 3;
        String[] cities = {"a", "b", "c", "d", "a"};

        // when
        int actual = instance.solution(cacheSize, cities);

        // then
        Assertions.assertEquals(25, actual);
    }

}
