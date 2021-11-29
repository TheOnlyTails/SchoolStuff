package november.twentynine

import Nov29.*

data class Quad<A, B, C, D>(val first: A, val second: B, val third: C, val fourth: D)

infix fun <A, B, C> Pair<A, B>.to(that: C) = Triple(this.first, this.second, that)
infix fun <A, B, C, D> Triple<A, B, C>.to(that: D) = Quad(this.first, this.second, this.third, that)
class TestFailedException(message: String) : Exception(message)

fun <T> String.makeTest(param: T, result: Boolean = true, f: (T) -> Boolean) =
	Quad(this, f, param, result)

val tests = arrayOf(
	"digit count by parity - true".makeTest(4141) { digitCountByParityEqual(it) },
	"digit count by parity - false".makeTest(41414, false) { digitCountByParityEqual(it) },
	"ones digit appears only one - true".makeTest(4361) { isOnesDigitUnique(it) },
	"ones digit appears only one - false".makeTest(1361) { isOnesDigitUnique(it) },
	"ones digit appears only one - true".makeTest(4361) { isSortedDescendingStep1(it) },
	"ones digit appears only one - false".makeTest(1361) { isSortedDescendingStep1(it) },
)

fun main() {
	tests.forEach { (name, f, param, expected) ->
		when (f(param) == expected) {
			true -> println("Test passed: $name ($param)")
			false -> throw TestFailedException("Test failed: $name ($param) != $expected")
		}
	}
}
