package com.aks.algorithm.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/1844
 */
public class 게임_맵_최단거리 {

    private final int[] N = {1, 0, -1, 0}; // 아래쪽, 오른쪽, 왼쪽, 위쪽
    private final int[] C = {0, 1, 0, -1};

    public int solution(int[][] maps) {
        // 초기화
        int[][] visited = new int[maps.length][maps[0].length];
        visited[0][0] = 1;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int currentR = cur[0]; // 0
            int currentC = cur[1]; // 0

            for (int i = 0; i < 4; i++) {
                int nextR = currentR + N[i]; // 1, 0, -1, 0
                int nextC = currentC + C[i]; // 0, 1, 0, -1

                // row 가 범위를 벗어난 경우
                if (nextR < 0 || nextR > maps.length - 1) continue;

                // column 이 범위를 벗어난 경우
                if (nextC < 0 || nextC > maps[0].length - 1) continue;

                // 갈 수 없는 경우
                if (maps[nextR][nextC] == 0) continue;

                // 이미 방문한 곳인 경우
                if (visited[nextR][nextC] != 0) continue;

                visited[nextR][nextC] = visited[currentR][currentC] + 1;
                q.add(new int[]{nextR, nextC});

            }

        }

        int answer = visited[maps.length - 1][maps[0].length - 1];

        return answer == 0 ? -1 : answer;
    }


}
