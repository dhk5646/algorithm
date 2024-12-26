package com.aks.algorithm.programmers.level3;

public class 몸짱_트레이너_라이언의_고민 {
    public int solution(int lockerCriteriaNumber, int userNumber, int[][] timetable) {
        int answer = 0;

        int maxDucpliationUserNumber = getMaxDuplicationUserNumber(userNumber, timetable);

        // 중복된 손님들에게 최적 라커자리를 배치했을 때 최적 거리를 구한다.


        return answer;

    }

    // 최대로 겹칠 수 있는 사용자의 수를 확인한다.
    private int getMaxDuplicationUserNumber(int userNumber, int[][] timetable) {

        int maxUserNumber = 0;
        for (int i = 0; i < userNumber; i++) {
            int tempMaxUserNumber = 0;

            for (int j = 0; j < userNumber; j++) {
                if (i == j) {
                    tempMaxUserNumber++;
                } else {
                    int[] source = timetable[i];
                    int[] target = timetable[j];

                    if (source[0] >= target[0] && source[0] <= target[1]) {
                        tempMaxUserNumber++;
                    } else if (source[1] >= target[0] && source[1] <= target[1]) {
                        tempMaxUserNumber++;
                    }
                }
            }

            if (tempMaxUserNumber > maxUserNumber) maxUserNumber = tempMaxUserNumber;
        }

        return maxUserNumber;
    }

    public static void main(String[] args) {
        몸짱_트레이너_라이언의_고민 c = new 몸짱_트레이너_라이언의_고민();
        int[][] timetable = {{1140, 1200}, {1150, 1200}, {1100, 1200}, {1210, 1300}, {1220, 1280}};
        int result = c.solution(4, 5, timetable);

        System.out.printf("result = %d\n", result);
    }
}
