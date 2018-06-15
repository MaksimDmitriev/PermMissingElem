package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    public void empty() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(new int[]{}));
    }

    @Test
    public void single() {
        Solution solution = new Solution();
        assertEquals(2, solution.solution(new int[]{1}));
    }

    @Test
    public void single2() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(new int[]{2}));
    }

    @Test
    public void small() {
        Solution solution = new Solution();
        assertEquals(4, solution.solution(new int[]{2, 3, 1, 5}));
    }

    @Test
    public void extreme() {
        int count = 1_00_000;
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = i + 1;
        }
        Solution solution = new Solution();
        assertEquals(1_00_000 + 1, solution.solution(array));
    }
}