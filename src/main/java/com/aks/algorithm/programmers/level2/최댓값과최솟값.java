package com.aks.algorithm.programmers.level2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12939
 */
public class 최댓값과최솟값 {
    public String solution(String s) {

        String[] stringArray = s.split(" ");

        List<Integer> numbers = Arrays.stream(stringArray)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int minNumber = numbers.stream().min(Integer::compareTo).get();
        int maxNumber = numbers.stream().max(Integer::compareTo).get();

        return minNumber + " " + maxNumber;
    }
}
