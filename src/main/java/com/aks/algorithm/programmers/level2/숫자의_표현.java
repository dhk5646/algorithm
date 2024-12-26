package com.aks.algorithm.programmers.level2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12924
 */
public class 숫자의_표현 {
    public int solution(int n) {
        int answer = 0;
        int maxIndex = 10000;
        for (int i = 1; i <= maxIndex; i++) {
            if (i > n) break; // 시작값이 가 n 보다 큰 경우는 불필요

            int sum = 0;
            for (int j = i; j <= maxIndex; j++) {
                sum += j;
                if (sum == n) {
                    answer += 1;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}
