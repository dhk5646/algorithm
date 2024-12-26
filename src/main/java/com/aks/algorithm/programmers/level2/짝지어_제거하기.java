package com.aks.algorithm.programmers.level2;

import java.util.Stack;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12973">...</a>
 */
public class 짝지어_제거하기 {
    public int solution(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                if (stack.peek() == ch) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

}
