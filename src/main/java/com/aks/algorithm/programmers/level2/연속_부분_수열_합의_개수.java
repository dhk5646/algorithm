package com.aks.algorithm.programmers.level2;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/131701">...</a>
 */
public class 연속_부분_수열_합의_개수 {

    public int solution(int[] elements) {

        Set<Integer> set = new HashSet<>();

        // i : 합의 개수
        for (int count = 0; count < elements.length; count++) {
            // j : 시작점
            for (int start = 0; start < elements.length - count; start++) {
                int sum = 0;
                //  시작점부터 종료점까지 합산을 구한다.
                for (int end = start; end <= start + count; end++) {
                    sum += elements[end];
                }

                set.add(sum);
            }
        }

        return set.size();
    }
}
