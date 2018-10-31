/*
 * KOTLIN PSI SPEC TEST (NEGATIVE)
 *
 * SECTIONS: constant-literals, boolean-literals
 * PARAGRAPH: 1
 * SENTENCE: [2] These are strong keywords which cannot be used as identifiers unless escaped.
 * NUMBER: 15
 * DESCRIPTION: The use of Boolean literals as the identifier (without backtick) in the parameter.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

fun f1(true: Int) {}

fun f2(false: Boolean, true: Boolean) = false

fun f3(val true: Boolean = false, var true: Boolean) = false

class A {
    val x1: Boolean = true
        set(false) = true
    var x2: Boolean = false
        set(vararg true: Boolean) = false
}
