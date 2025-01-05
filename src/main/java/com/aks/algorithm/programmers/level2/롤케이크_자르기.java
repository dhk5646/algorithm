package com.aks.algorithm.programmers.level2;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/132265
 */
public class 롤케이크_자르기 {
    public int solution(int[] topping) {
        int answer = 0;

        // 오른쪽 맵 초기화
        Map<Integer, Integer> rightMap = new HashMap<>();
        for (int item : topping) {
            int itemCount = rightMap.getOrDefault(item, 0) + 1;
            rightMap.put(item, itemCount);
        }

        Map<Integer, Integer> leftMap = new HashMap<>();
        for (int i = 0; i < topping.length - 1; i++) {

            int item = topping[i];

            // 왼쪽 맵 추가
            int leftItemCount = leftMap.getOrDefault(item, 0) + 1;
            leftMap.put(item, leftItemCount);

            // 오른쪽 맵 삭제
            int rightItemCount = rightMap.get(item) - 1;
            if (rightItemCount == 0) {
                rightMap.remove(item);
            } else {
                rightMap.put(item, rightItemCount);
            }

            if (leftMap.size() == rightMap.size()) {
                answer++;
            }
        }

        return answer;
    }

}
