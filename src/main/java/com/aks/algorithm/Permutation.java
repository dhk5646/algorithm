package com.aks.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 순열 알고리즘
 */
public class Permutation {

    /**
     * 주어진 배열에서 순열을 생성합니다.
     *
     * @param n       순열을 생성할 정수 배열입니다. 배열의 각 원소는 순서를 정할 대상이 됩니다.
     * @param r       배열 `n`에서 선택할 원소의 개수입니다. 생성할 순열의 길이를 의미합니다.
     * @param visited 각 원소의 사용 여부를 확인하는 논리형 배열입니다. 이미 사용된 원소를 표시합니다.
     * @param current 현재 생성 중인 순열을 저장하는 리스트입니다. 재귀 호출 과정에서 순열이 점차 완성됩니다.
     * @param result  완성된 모든 순열을 저장하는 리스트입니다. 각 순열은 리스트 형태로 저장됩니다.
     */
    public static void permute(int[] n, int r, boolean[] visited, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == r) { // 순열이 길이 r만큼 완성되면
            result.add(new ArrayList<>(current)); // 결과 리스트에 추가
            return;
        }

        for (int i = 0; i < n.length; i++) {
            if (visited[i]) continue; // 이미 사용한 원소는 건너뜀

            visited[i] = true; // 원소 사용 표시
            current.add(n[i]); // 현재 순열에 추가

            permute(n, r, visited, current, result); // 재귀 호출로 다음 단계 진행

            visited[i] = false; // 백트래킹: 사용 표시 해제
            current.removeLast(); // 마지막 추가한 원소 제거
        }
    }


}
