package com.aks.algorithm.programmers.level2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12924
 */
public class JadenCase_문자열_만들기 {
    public String solution(String s) {

        String[] sArr = s.split("");
        boolean isFirst = true; // 처음엔 무조건 대문자 처리.

        StringBuilder answer = new StringBuilder();
        for (String ss : sArr) {
            String word = isFirst ? ss.toUpperCase() : ss.toLowerCase();
            answer.append(word);
            isFirst = " ".equals(ss); // 현재 문자가 공백문자인 경우, 다음 문자 대문자 처리 목적.
        }

        return answer.toString();
    }


}
