package com.aks.algorithm.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/43165?language=java
 */
public class 타겟_넘버 {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target);
    }

    // BFS
    public static int bfs(int[] numbers, int target) {
        int count = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(Node.init());

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int index = current.index();
            int sum = current.sum();

            System.out.println("BFS visiting: " + current);

            if (index == numbers.length) {
                if (sum == target) count++;
            } else {
                int next = index + 1;
                queue.add(Node.of(next, sum + numbers[index]));
                queue.add(Node.of(next, sum - numbers[index]));
            }
            System.out.println("Queue size: " + queue.size());
        }

        return count;
    }

    // DFS
    public static int dfs(int[] numbers, int target) {
        int count = 0;
        Stack<Node> stack = new Stack<>();
        stack.push(Node.init());

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            int index = current.index();
            int sum = current.sum();

            System.out.println("DFS visiting: " + current);

            if (index == numbers.length) {
                if (sum == target) count++;
            } else {
                int next = index + 1;
                // DFS: stack이 LIFO이므로 순서 주의
                stack.push(Node.of(next, sum + numbers[index]));
                stack.push(Node.of(next, sum - numbers[index]));
            }
            System.out.println("Stack size: " + stack.size());
        }

        return count;
    }

    record Node(
            int index,
            int sum
    ) {

        public static Node init() {
            return new Node(0, 0);
        }

        public static Node of(int index, int sum) {
            return new Node(index, sum);
        }

        @Override
        public String toString() {
            return "Node{index=" + index + ", sum=" + sum + "}";
        }
    }
}
