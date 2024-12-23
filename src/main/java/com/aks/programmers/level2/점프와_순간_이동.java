package com.aks.programmers.level2;

import java.util.Stack;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12980">...</a>
 */
public class 점프와_순간_이동 {
    public int solution(int n) {
        int ans = 0;

        while (n != 0) {
            // 짝수
            if (n % 2 == 0) {
                n = n / 2; // 2 0

                // 홀수
            } else {
                n -= 1; // 4
                ans++; // 1
            }
        }

        return ans;
    }

}
