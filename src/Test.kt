import Dec08.*
import Nov29.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

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
        assertEquals(calculateCityTax(37.0, 2, 1), 5350.0)
        assertNotEquals(calculateCityTax(37.0, 3, 1), 5350.0)
        assertNotEquals(calculateCityTax(37.0, 2, 4), 5350.0)
        assertNotEquals(calculateCityTax(137.0, 2, 1), 5350.0)
    }

    @Test
    fun `get leftmost digit`() {
        assertEquals(getLeftmostDigit(4357), 4)
        assertNotEquals(getLeftmostDigit(4357), 7)
    }

    @Test
    fun `are end digits equal`() {
        assertTrue(areEndDigitsEqual(459, 9231))
        assertFalse(areEndDigitsEqual(437, 9231))
    }
}