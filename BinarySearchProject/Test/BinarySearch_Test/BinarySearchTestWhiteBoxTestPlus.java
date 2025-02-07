package BinarySearch_Test;

import static org.junit.Assert.*;
import org.junit.Test;

import Binary_Search.BinarySearch;

public class BinarySearchTestWhiteBoxTestPlus {
	
    
    @Test
    public void testElementPresentAtStart() {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14};
        int target = 2;
        assertEquals(0, BinarySearch.binarySearch(sortedArray, target));
    }

    @Test
    public void testElementPresentAtMiddle() {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14};
        int target = 8;
        assertEquals(3, BinarySearch.binarySearch(sortedArray, target));
    }
    
    @Test
    public void testElementPresentAtEnd() {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14};
        int target = 14;
        assertEquals(6, BinarySearch.binarySearch(sortedArray, target));
    }

    @Test
    public void testElementNotPresent() {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14};
        int target = 5;
        assertEquals(-1, BinarySearch.binarySearch(sortedArray, target));
    }
    
    @Test
    public void testEmptyArray() {
        int[] sortedArray = {};
        int target = 10;
        assertEquals(-1, BinarySearch.binarySearch(sortedArray, target));
    }
    
    @Test
    public void testSingleElementArrayFound() {
        int[] sortedArray = {8};
        int target = 8;
        assertEquals(0, BinarySearch.binarySearch(sortedArray, target));
    }
    
    @Test
    public void testSingleElementArrayNotFound() {
        int[] sortedArray = {8};
        int target = 10;
        assertEquals(-1, BinarySearch.binarySearch(sortedArray, target));
    }
}
