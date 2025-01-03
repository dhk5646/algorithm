package com.aks.algorithm.programmers.level2;

import java.util.*;

public class 괄호_회전하기 {
    public int solution(String s) {
        int answer = 0;

        // 1/ 한바퀴 돌려서 붙인다. (-1)
        // }]()[{}]()[

        // 초기화
        String[] sArr = s.split("");
        LinkedList<String> l = new LinkedList<>(Arrays.asList(sArr));

        for (int i = 0; i < l.size(); i++) {
            answer += check(l);
            l.add(l.remove());
        }
        return answer;
    }

    private int check(LinkedList<String> q) {
        Stack<String> stack = new Stack<>();
        for (String s : q) {
            if ("{[(".contains(s)) {
                stack.push(s);
            } else {
                if (stack.isEmpty()) {
                    return 0;
                }

                String pop = stack.pop();

                if ("}".equals(s) && !"{".equals(pop)) {
                    return 0;
                }

                if ("]".equals(s) && !"[".equals(pop)) {
                    return 0;
                }

                if (")".equals(s) && !"(".equals(pop)) {
                    return 0;
                }
            }

        }

        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }

}
