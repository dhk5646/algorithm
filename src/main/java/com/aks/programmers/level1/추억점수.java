package com.aks.programmers.level1;

import java.util.HashMap;
import java.util.Map;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/176963?language=java
 * */
public class 추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> memoryScoreMap = makeMemoryScoreMap(name, yearning);

        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            answer[i] =  sumScore(memoryScoreMap, photo[i]);
        }

        return answer;

    }

    private int sumScore(Map<String, Integer> memoryScoreMap, String[] photos) {
        int totalScore = 0;
        for (String photo : photos) {
            totalScore += memoryScoreMap.getOrDefault(photo, 0);
        }
        return totalScore;

//        return Arrays.stream(photos)
//                .mapToInt(name -> memoryScoreMap.getOrDefault(name, 0))
//                .sum();
    }

    // 추억 점수 Map
    private Map<String, Integer> makeMemoryScoreMap(String[] name, int[] yearning) {
        Map<String, Integer> memoryCousrsMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            memoryCousrsMap.put(name[i], yearning[i]);
        }

        return memoryCousrsMap;
    }
}
