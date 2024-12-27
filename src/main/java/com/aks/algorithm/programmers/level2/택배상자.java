package com.aks.algorithm.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/131704
 */
public class 택배상자 {
    public int solution(int[] order) {

        Queue<Integer> queue = this.createQueue(order.length);
        Stack<Integer> stack = new Stack<>();

        int answer = 0;

        a:
        for (int num : order) {
            while (true) {
                if (!queue.isEmpty() && queue.peek() == num) {
                    queue.poll();
                    break;
                } else if (!stack.isEmpty() && stack.peek() == num) {
                    stack.pop();
                    break;
                } else if (queue.isEmpty() && stack.peek() != num) {
                    break a;
                } else {
                    Integer poll = queue.poll();
                    stack.add(poll);
                }
            }

            answer++;
        }


        return answer;
    }

    private Queue<Integer> createQueue(int length) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= length; i++) {
            queue.add(i);
        }
        return queue;
    }
}
