/*
 * KOTLIN PSI SPEC TEST (POSITIVE)
 *
 * SECTIONS: constant-literals, real-literals
 * PARAGRAPH: 3
 * SENTENCE: [1] The whole-number part and the exponent part may be omitted.
 * NUMBER: 6
 * DESCRIPTION: Real literals with omitted a whole-number part, suffixed by f/F (float suffix) followed by an exponent mark without digits.
 */

val value = .0EF
val value = .0ef
val value = .00e-f
val value = .000E+F

val value = .0eF
val value = .00E+f
val value = .000ef
val value = .0000Ef
val value = .0e+F
val value = .00E-F
val value = .000eF
val value = .0000ef
val value = .0E-F

val value = .888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888e+f
val value = .000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000eF
val value = .000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e-f
val value = .000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e+F
