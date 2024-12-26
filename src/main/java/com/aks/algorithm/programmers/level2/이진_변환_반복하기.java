package com.aks.algorithm.programmers.level2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/70129
 */
public class 이진_변환_반복하기 {
    public int[] solution(String s) {
        int[] answer = {0, 0};

        while (!"1".equals(s)) {
            int len = s.length();
            int lenOfZero = s.replace("1", "").length(); // 제거할 0의 개수
            int lenOfOne = len - lenOfZero; // 0 제거 후 길이

            // 이진 변환
            StringBuffer sb = new StringBuffer();
            while (lenOfOne > 1) {
                sb.insert(0, lenOfOne % 2);
                lenOfOne = lenOfOne / 2;
            }
            sb.insert(0, 1);

            s = sb.toString();

            answer[0]++; // 회차 증가
            answer[1] += lenOfZero; // 제거한 0의 개수 합산
        }

        return answer;
    }
}
