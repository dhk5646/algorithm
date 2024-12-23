package com.aks.programmers.level2;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/92341"></a>
 */
public class 주차_요금_계산 {

    public int[] solution(int[] fees, String[] records) {

        Map<String, Integer> vehicleStartMap = new HashMap<>(); // 차량별 입차시간
        Map<String, Integer> vehicleMinuteMap = new HashMap<>(); // 차량별 누적 주차시간

        // 차량별 출차시간 map 을 생성한다.
        for (String record : records) {
            String[] recordArray = record.split(" ");

            // 입차인경우
            if (recordArray[2].equals("IN")) {
                vehicleStartMap.put(recordArray[1], calculateMinute(recordArray[0]));

            } else if (recordArray[2].equals("OUT")) {
                int startMinute = vehicleStartMap.get(recordArray[1]); // 입차시간

                int endMinute = calculateMinute(recordArray[0]); // 출차시간

                int useMinute = endMinute - startMinute;

                int totalMinute = vehicleMinuteMap.getOrDefault(recordArray[1], 0);

                vehicleMinuteMap.put(recordArray[1], useMinute + totalMinute);

                vehicleStartMap.remove(recordArray[1]);
            }
        }

        // 23:59
        vehicleStartMap.forEach((key, value) -> {
            int startMinute = vehicleStartMap.get(key); // 입차시간

            int endMinute = calculateMinute("23:59"); // 출차시간

            int useMinute = endMinute - startMinute;

            int totalMinute = vehicleMinuteMap.getOrDefault(key, 0);

            vehicleMinuteMap.put(key, useMinute + totalMinute);
        });


        return vehicleMinuteMap.keySet().stream().sorted()
                .mapToInt((key) -> calculateFee(fees, vehicleMinuteMap.get(key))).toArray();
    }

    private Integer calculateMinute(String s) {
        String[] sArray = s.split(":");
        return Integer.parseInt(sArray[0]) * 60 + Integer.parseInt(sArray[1]);
    }

    // 5000 + ⌈(334 - 180) / 10⌉ x 600 = 14600
    private int calculateFee(int[] fees, int minute) {
        int basicMinute = fees[0]; // 기본시간
        int basicFee = fees[1]; // 기본요금
        int unitMinute = fees[2]; // 단위시간
        int addedFee = fees[3]; // 추가요금

        if (minute < basicMinute) {
            return basicFee;
        }

        int middleFee = (minute - basicMinute) % unitMinute == 0 ? (minute - basicMinute) / unitMinute : (minute - basicMinute) / unitMinute + 1;

        return basicFee + middleFee * addedFee;
    }
}
