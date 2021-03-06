@file:Suppress("FunctionName")

import Dec08.*
import Dec27.areOuterAndInnerDigitSumsEqual
import Dec27.isParityAlternating
import Feb07.cycleRight
import Feb09.a
import Jan03.isHershard
import Jan03.isMoran
import Jan10.canDivideByAllDigits
import Jan10.isAbsoluteDifference1
import Jan17.*
import Jan19.areArraysEqual
import Jan19.biggestDigitSum
import Jan26.containsPalindrome
import Jan31.containsAllDigits
import Jan31.containsDigit
import Nov29.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Test {
    @Test
    fun `digit count by parity`() {
        assertTrue(digitCountByParityEqual(4141))
        assertFalse(digitCountByParityEqual(41414))
    }

    @Test
    fun `ones digit appears only once`() {
        assertTrue(isOnesDigitUnique(4361))
        assertFalse(isOnesDigitUnique(1361))
    }

    @Test
    fun `digits sorted from high to low with step size 1`() {
        assertTrue(isSortedDescendingStep1(8765))
        assertFalse(isSortedDescendingStep1(9765))
    }

    @Test
    fun `digits only go up or down 1`() {
        assertTrue(isStep1BothDirs(876565434))
        assertFalse(isStep1BothDirs(876515484))
    }

    @Test
    fun `calculate city tax`() {
        assertEquals(5350.0, calculateCityTax(37.0, 2, 1))
        assertNotEquals(5350.0, calculateCityTax(37.0, 3, 1))
        assertNotEquals(5350.0, calculateCityTax(37.0, 2, 4))
        assertNotEquals(5350.0, calculateCityTax(137.0, 2, 1))
    }

    @Test
    fun `get leftmost digit`() {
        assertEquals(4, getLeftmostDigit(4357))
        assertNotEquals(7, getLeftmostDigit(4357))
    }

    @Test
    fun `are end digits equal`() {
        assertTrue(areEndDigitsEqual(459, 9231))
        assertFalse(areEndDigitsEqual(437, 9231))
    }

    @Test
    fun `is parity alternating between digits`() {
        assertTrue(isParityAlternating(8365))
        assertTrue(isParityAlternating(1234))
        assertFalse(isParityAlternating(1223))
        assertFalse(isParityAlternating(2431))
    }

    @Test
    fun `are the sums of the outer and inner digits equal`() {
        assertTrue(areOuterAndInnerDigitSumsEqual(1234))
        assertTrue(areOuterAndInnerDigitSumsEqual(231))
        assertTrue(areOuterAndInnerDigitSumsEqual(1212))
        assertTrue(areOuterAndInnerDigitSumsEqual(2222))
        assertFalse(areOuterAndInnerDigitSumsEqual(1221))
        assertFalse(areOuterAndInnerDigitSumsEqual(1211))
    }

    @Test
    fun `is number hershard's number`() {
        assertTrue(isHershard(2022))
        assertTrue(isHershard(2220))
        assertFalse(isHershard(2222))
    }

    @Test
    fun `is number moran's number`() {
        assertTrue(isMoran(2022))
        assertTrue(isMoran(1233))
        assertFalse(isMoran(1234))
        assertFalse(isMoran(1235))
    }

    @Test
    fun `is the absolute difference between each digit 1`() {
        assertTrue(isAbsoluteDifference1(1234))
        assertTrue(isAbsoluteDifference1(12123432))
        assertFalse(isAbsoluteDifference1(12123431))
        assertFalse(isAbsoluteDifference1(12123433))
    }

    @Test
    fun `does the number divide evenly by all its digits`() {
        assertTrue(canDivideByAllDigits(224))
        assertTrue(canDivideByAllDigits(126))
        assertFalse(canDivideByAllDigits(1234))
        assertFalse(canDivideByAllDigits(127))
    }

    @Test
    fun `get biggest number in the array`() {
        val arr = intArrayOf(346, 188, 918, 134, 714)
        assertEquals(918, max(arr))
        assertNotEquals(919, max(arr))
    }

    @Test
    fun `is element in array`() {
        val arr = intArrayOf(346, 188, 918, 134, 714)
        assertTrue(contains(arr, 918))
        assertFalse(contains(arr, 919))
    }

    @Test
    fun `how many times does the number appear in the array`() {
        val arr = intArrayOf(346, 188, 918, 134, 714, 918)
        assertEquals(2, count(arr, 918))
        assertNotEquals(3, count(arr, 918))
    }

    @Test
    fun `find the array element with the biggest sum of its digits`() {
        val arr = intArrayOf(312, 417, 356, 323, 855)
        assertEquals(855, biggestDigitSum(arr))
        assertNotEquals(854, biggestDigitSum(arr))
    }

    @Test
    fun `check if two arrays are equal`() {
        val arr1 = intArrayOf(830, 847, 523, 621, 588)
        val arr2 = intArrayOf(661, 220, 197, 299, 259)
        assertTrue(areArraysEqual(arr1, arr1))
        assertTrue(areArraysEqual(arr2, arr2))
        assertFalse(areArraysEqual(arr1, arr2))
        assertFalse(areArraysEqual(arr2, arr1))
    }

    @Test
    fun `does the array contains a palindrome`() {
        val arr = intArrayOf(907121709)
        assertTrue(containsPalindrome(arr))
    }

    @Test
    fun `check if a number contains a digit`() {
        assertTrue(containsDigit(1234, 2))
        assertFalse(containsDigit(1234, 5))
    }

    @Test
    fun `check if an array's elements contains a digit`() {
        val arr = intArrayOf(1234, 578, 90)
        assertTrue(containsDigit(arr, 2))
        assertFalse(containsDigit(arr, 6))
    }

    @Test
    fun `check if an array's elements contains all digits`() {
        assertTrue(containsAllDigits(intArrayOf(1234, 5678, 90)))
        assertFalse(containsAllDigits(intArrayOf(1234, 578, 90)))
    }

    @Test
    fun `cycle an array to the right`() {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        assertArrayEquals(intArrayOf(5, 1, 2, 3, 4), cycleRight(arr))
        assertNotEquals(intArrayOf(2, 3, 4, 5, 1), cycleRight(arr))

        val arr2 = intArrayOf(420, 87, 149, 23, 699)
        assertArrayEquals(intArrayOf(699, 420, 87, 149, 23), cycleRight(arr2))
        assertNotEquals(intArrayOf(87, 149, 23, 699, 420), cycleRight(arr2))
    }
}