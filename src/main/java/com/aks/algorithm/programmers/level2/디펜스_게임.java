package com.aks.algorithm.programmers.level2;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/142085
 */
public class 디펜스_게임 {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int totalEnemy = 0;
        for (int e : enemy) {
            pq.add(e);
            totalEnemy += e;

            if (n < totalEnemy && k == 0) {
                break;

            } else if (k > 0 && n < totalEnemy) {
                int maxEnemy = pq.poll();
                totalEnemy -= maxEnemy;
                k--;

            } else if (k == 0) {
                totalEnemy -= e;
                n -= e;
            }

            answer++;
        }

        return answer;
    }

}
