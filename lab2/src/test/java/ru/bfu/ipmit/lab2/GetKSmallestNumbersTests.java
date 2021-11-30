package ru.bfu.ipmit.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GetKSmallestNumbersTests {

    @Test
    void shouldReturnKSmallestNumbers() {
        byte[] array = {8, 9, 1, 10};
        int k = 2;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);

        byte[] expectedResult = {1, 8};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void shouldReturnKSmallestNumbers1() {
        byte[] array = {113, -97, 63, -63, 101, 14, 89, -47, 12, 92};
        int k = 5;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);

        byte[] expectedResult = {-97, -63, -47, 12, 14};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void shouldReturnKSmallestNumbers2() {
        byte[] array = {71, -30, -103, 29, 101, -3, 79};
        int k = 0;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);

        byte[] expectedResult = {};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void shouldReturnKSmallestNumbers3() {
        byte[] array = {-38, 12, 34, 65, 123, 111, 103, -123, 3, 93, 69, 91,
                93, -33, 77, 82, 117, 78, 101, 99, 2, 97, 114, 104, 82, 44, 9,
                31, 56, 5, 48, 61, 39, -81, 39, 85, 80, 54, -60, 41, 34, 44, 4,
                50, 31, 20, 70, 35, -7, 73, 37, 94, -101, 115, 13, 127, 81, 3, 67,
                51, 70, 48, 35, 28, 52, 39, 57, 91, 6, 111, 107, 9, 61, 42, 14, 122,
                5, 28, 16, 84, 57, 126, 69, 63, 9, 110, 126, 94, -122, 53, 61, 78,
                105, 90, 84, 124, 49, 109, 104, 56, 52, -57, -11, 124, 118, -3, 24,
                24, 55, 101, 33, 77, 5, 58, 7, -80, 52, 48, 90, 36, 19, -56, 92, 12,
                65, 37, 125, 66, 8, 68, 46, 80, 28, -65, 94, 68, 124, 76, 127, 105,
                8, 30, -74, 18, 61, 78, 43, 10, 112, 124, 74, 38, 96, 53, 109, 121,
                45, 29, 16, 104, 42, 57, 123, 95, 107, 65, 88, 30, 105, 46, 60, 94,
                12, 17, 109, 34, 98, 13, 53, 76, 35, 6, 102, 5, 83, 106, 25, 103, 106,
                123, 103, 81, 47, 78, 22, 25, 93, -14, 7, 77};
        int k = 27;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);

        byte[] expectedResult = {-123, -122, -101, -81, -80, -74, -65, -60, -57, -56, -38,
                -33, -14, -11, -7, -3, 2, 3, 3, 4, 5, 5, 5, 5, 6, 6, 7};
        assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    void shouldReturnKSmallestNumbers4() {
        byte[] array = {};
        int k = 0;

        byte[] actualResult = Lab2.getKSmallestNumbers(array, k);

        byte[] expectedResult = {};
        assertArrayEquals(actualResult, expectedResult);
    }
}
