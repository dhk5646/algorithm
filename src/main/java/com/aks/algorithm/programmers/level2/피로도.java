package com.aks.algorithm.programmers.level2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/87946
 */
public class 피로도 {

    private int ANSWER = 0;

    public int solution(int k, int[][] dungeons) {

        boolean[] visited = new boolean[dungeons.length];

        this.permute(dungeons, visited, 1, k);

        return ANSWER;
    }

    private void permute(int[][] dungeons, boolean[] visited, int depth, int tired) {

        // 마지막 던전을 초과한 경우
        if (depth > dungeons.length) {
            return;
        }

        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i]) continue; // 방문한 곳이라면 skip

            // 던전 클리어 가능한 경우
            if (tired >= dungeons[i][0]) {

                if (this.ANSWER < depth) {
                    this.ANSWER = depth; // 던전 클리어 건수
                }

                visited[i] = true;
                this.permute(dungeons, visited, depth + 1, tired - dungeons[i][1]);

                visited[i] = false;

                // 던전 클리어 불가능한 경우
            }
        }
    }
}
