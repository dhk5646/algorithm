package com.aks.programmers.level2;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12941
 * */
public class 최솟값_만들기 {
    public int solution(int []A, int []B) {
        int answer = 0;

        // 정렬한다.
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0 ; i < A.length; i++) {
            answer += A[i] * B[B.length -1 - i];
        }

        return answer;
    }
}
