// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun zero() = 0

fun box(): String {
    assertFailsWith<IllegalArgumentException> {
        val uintProgression = 1u..7u
        for (i in uintProgression step zero()) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        val ulongProgression = 1uL..7uL
        for (i in ulongProgression step zero().toLong()) {
        }
    }

    return "OK"
}