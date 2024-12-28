package com.aks.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PermutationTest {

    @Test
    public void testPermutation1() {
        // given
        int[] n = {1, 2};
        int r = 2;
        boolean[] visited = new boolean[r];
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        // when
        Permutation.permute(n, r, visited, current, result);


        // then
        List<List<Integer>> expected =
                List.of(
                        List.of(1, 2),
                        List.of(2, 1));

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPermutation2() {
        // given
        int[] n = {1, 2, 3};
        int r = 3;
        boolean[] visited = new boolean[r];
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        // when
        Permutation.permute(n, r, visited, current, result);


        // then
        List<List<Integer>> expected =
                List.of(
                        List.of(1, 2, 3),
                        List.of(1, 3, 2),
                        List.of(2, 1, 3),
                        List.of(2, 3, 1),
                        List.of(3, 1, 2),
                        List.of(3, 2, 1));

        Assertions.assertEquals(expected, result);
    }
}
