package com.aks.algorithm.programmers.level2;

import java.util.HashSet;
import java.util.Set;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42839
 */
public class 소수_찾기 {

    public int solution(String numbers) {
        int answer = 0;

        String[] numberStrings = numbers.split("");
        boolean[] visited = new boolean[numberStrings.length];
        Set<Integer> result = new HashSet<>();

        this.permute(numberStrings, visited, 0, new StringBuffer(), result);

        for (Integer i : result) {
            answer += isPrime(i) ? 1 : 0;
        }

        return answer;
    }

    private boolean isPrime(int number) {
        if (number <= 1) return false; // 1 이하는 소수가 아님
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false; // 나누어떨어지면 소수가 아님
        }
        return true; // 나누어떨어지지 않으면 소수
    }

    private void permute(String[] n, boolean[] visited, int depth, StringBuffer current, Set<Integer> resultSet) {

        if (depth == n.length) {
            return;
        }

        for (int i = 0; i < n.length; i++) {
            if (visited[i]) continue;

            // 방문하지 않은 곳이라면
            visited[i] = true;
            current.append(n[i]);
            int result = Integer.parseInt(current.toString());
            resultSet.add(result);

            this.permute(n, visited, depth + 1, current, resultSet);

            // 원복
            visited[i] = false;
            current.deleteCharAt(current.length() - 1);
            
        }
    }
}
