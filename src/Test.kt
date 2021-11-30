package november.twentynine

import Nov29.*

data class Quad<A, B, C, D>(val first: A, val second: B, val third: C, val fourth: D)

fun <T> String.makeTest(param: T, f: (T) -> Boolean) =
	Quad(this, f, param, !this.endsWith("false"))

val tests = arrayOf(
	"digit count by parity".makeTest(4141) { digitCountByParityEqual(it) },
	"digit count by parity - false".makeTest(41414) { digitCountByParityEqual(it) },
	"ones digit appears only one".makeTest(4361) { isOnesDigitUnique(it) },
	"ones digit appears only one - false".makeTest(1361) { isOnesDigitUnique(it) },
	"digits sorted from high to low with step size 1".makeTest(8765) { isSortedDescendingStep1(it) },
	"digits sorted from high to low with step size 1 - false".makeTest(9765) { isSortedDescendingStep1(it) },
	"digits only go up or down 1".makeTest(876565434) { isStep1BothDirs(it) },
	"digits only go up or down 1 - false".makeTest(876515484) { isStep1BothDirs(it) },
)

fun main() {
	tests.forEach { (name, f, param, expected) ->
		when (f(param) == expected) {
			true -> println("Test passed: $name ($param)")
			false -> println("ERROR: Test failed - $name ($param) != $expected")
		}
	}

	println("Al!l tests passed")
}
