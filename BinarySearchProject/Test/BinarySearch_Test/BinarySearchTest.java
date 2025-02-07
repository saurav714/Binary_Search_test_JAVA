package BinarySearch_Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import BinarySearchTest.BinarySearch;
class BinarySearchTest {

    @Test
    void testBinarySearchTargetFound() {
        int[] array = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int expectedIndex = 3;
        int result = BinarySearch.binarySearch(array, target);
        assertEquals(expectedIndex, result);
    }

    @Test
    void testBinarySearchTargetNotFound() {
        int[] array = {1, 3, 5, 7, 9, 11};
        int target = 8;
        int result = BinarySearch.binarySearch(array, target);
        assertEquals(-1, result);
    }

    @Test
    void testBinarySearchEmptyArray() {
        int[] array = {};
        int target = 5;
        int result = BinarySearch.binarySearch(array, target);
        assertEquals(-1, result);
    }

    @Test
    void testBinarySearchSingleElement() {
        int[] array = {5};
        int target = 5;
        int result = BinarySearch.binarySearch(array, target);
        assertEquals(0, result);
    }

    @Test
    void testBinarySearchNegativeNumbers() {
        int[] array = {-10, -5, 0, 5, 10};
        int target = -5;
        int result = BinarySearch.binarySearch(array, target);
        assertEquals(1, result);
    }
    
    @Test
    void testBinarySearchTargetFound_1() {
        int[] array = {17, 21, 23, 29};
        int target = 17;
        int expectedIndex = 0;
        int result = BinarySearch.binarySearch(array, target);
        assertEquals(expectedIndex, result);
    }
    
    @Test
    void testBinarySearchTargetFound_2() {
        int[] array = {17};
        int target = 17;
        int expectedIndex = 0;
        int result = BinarySearch.binarySearch(array, target);
        assertEquals(expectedIndex, result);
    }
    
    @Test
    void testBinarySearchTargetNotFound_1() {
        int[] array = {17};
        int target = 0;
        int result = BinarySearch.binarySearch(array, target);
        assertEquals(-1, result);
    }
    
    @Test
    void testBinarySearchTargetFound_3() {
        int[] array = {9, 16, 18, 30, 31, 41, 45};
        int target = 45;
        int expectedIndex = 6;
        int result = BinarySearch.binarySearch(array, target);
        assertEquals(expectedIndex, result);
    }
    
    @Test
    void testBinarySearchTargetFound_4() {
        int[] array = {17, 18, 21, 23, 29, 38, 41};
        int target = 23;
        int expectedIndex = 3;
        int result = BinarySearch.binarySearch(array, target);
        assertEquals(expectedIndex, result);
    }
    
    @Test
    void testBinarySearchTargetFound_5() {
        int[] array = {17, 18, 21, 23, 29, 33, 38};
        int target = 21;
        int expectedIndex = 2;
        int result = BinarySearch.binarySearch(array, target);
        assertEquals(expectedIndex, result);
    }
    @Test
    void testBinarySearchTargetFound_6() {
        int[] array = {12, 18, 21, 23, 32};
        int target = 23;
        int expectedIndex = 3;
        int result = BinarySearch.binarySearch(array, target);
        assertEquals(expectedIndex, result);
    }
    
    @Test
    void testBinarySearchTargetNotFound_2() {
        int[] array = {21, 23, 29, 33, 38};
        int target = 25;
        int result = BinarySearch.binarySearch(array, target);
        assertEquals(-1, result);
    }
}
