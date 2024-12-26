package com.aks.algorithm.programmers.level2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/138476
 */
public class 귤_고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        // 귤을 크기별로 분류한다 (귤의 크기별 개수를 담는다.)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // 개수 순으로 정렬한다.
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Comparator.reverseOrder());

        // 판매하고자 하고싶은 귤의 개수를 뺀다.
        for (Integer integer : list) {
            if (k <= 0) break;
            k -= integer;

            answer++;

        }
        return answer;
    }

}
