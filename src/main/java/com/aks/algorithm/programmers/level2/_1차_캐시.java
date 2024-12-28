package com.aks.algorithm.programmers.level2;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/17680
 */
public class _1차_캐시 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        Queue<String> caches = new LinkedList<>();

        for (String s : cities) {
            String city = s.toLowerCase();

            // 조회
            answer += caches.contains(city) ? 1 : 5;

            // LRU 캐싱
            if (caches.size() == cacheSize) {
                if (caches.contains(city)) {
                    caches.remove(city);
                } else {
                    caches.poll();
                }
            }

            if (caches.size() < cacheSize) caches.add(city);
        }

        return answer;
    }
}
