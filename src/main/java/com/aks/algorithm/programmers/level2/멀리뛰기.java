package com.aks.algorithm.programmers.level2;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12914">멀리뛰기</a>
 */
public class 멀리뛰기 {

    public long solution(int n) {

        if (n == 1) return 1;
        if (n == 2) return 2;

        long answer = 0;
        long n1 = 1;
        long n2 = 2;

        for (int i = 3; i <= n; i++) {
            answer = (n1 + n2) % 1234567;

            n1 = n2;
            n2 = answer;
        }

        return answer;
    }
}
