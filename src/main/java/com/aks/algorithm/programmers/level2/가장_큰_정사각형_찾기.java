package com.aks.algorithm.programmers.level2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12905
 */
public class 가장_큰_정사각형_찾기 {
    public int solution(int[][] board) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (i == 0 || j == 0) {
                    if (board[i][j] > answer) answer = board[i][j];
                    continue;
                }

                if (board[i][j] == 0) continue;

                if (board[i - 1][j] == 0) continue;

                if (board[i][j - 1] == 0) continue;

                if (board[i - 1][j - 1] == 0) continue;

                int min = Math.min(Math.min(board[i - 1][j], board[i][j - 1]), board[i - 1][j - 1]);

                board[i][j] = min + 1;

                if (board[i][j] > answer) answer = board[i][j];

            }
        }

        return answer * answer;
    }
}
