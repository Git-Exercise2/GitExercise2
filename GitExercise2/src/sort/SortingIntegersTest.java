package sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingIntegersTest {

	@Test
    void testSortWithUnsortedArray() {
        int[] input = {87, 12, 25, 45, 22, 56, 96};
        int[] expected = {12, 22, 25, 45, 56, 87, 96};
        SortingIntegers.Sort(input);
        assertArrayEquals(expected, input, "The array should be sorted in ascending order.");
    }

    @Test
    void testSortWithAlreadySortedArray() {
        int[] input = {11, 22, 33, 44, 55, 66, 77};
        int[] expected = {11, 22, 33, 44, 55, 66, 77};
        SortingIntegers.Sort(input);
        assertArrayEquals(expected, input, "The array should remain unchanged as it is already sorted.");
    }

    @Test
    void testSortWithReverseSortedArray() {
        int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SortingIntegers.Sort(input);
        assertArrayEquals(expected, input, "The array should be sorted in ascending order.");
    }

    @Test
    void testSortWithSingleElementArray() {
        int[] input = {66};
        int[] expected = {66};
        SortingIntegers.Sort(input);
        assertArrayEquals(expected, input, "The array should remain unchanged as it contains only one element.");
    }

    @Test
    void testSortWithDuplicateElements() {
        int[] input = {7, 3, 8, 3, 1, 7};
        int[] expected = {1, 3, 3, 7, 7, 8};
        SortingIntegers.Sort(input);
        assertArrayEquals(expected, input, "The array should be sorted in ascending order, handling duplicates.");
	}

    @Test
    void testSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        SortingIntegers.Sort(input);
        assertArrayEquals(expected, input, "The array should remain unchanged as it is empty.");
    }

    
}