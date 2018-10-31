/*
 * KOTLIN PSI SPEC TEST (POSITIVE)
 *
 * SECTIONS: constant-literals, real-literals
 * PARAGRAPH: 4
 * SENTENCE: [1] The digits of the whole-number part or the fraction part or the exponent may be optionally separated by underscores, but an underscore may not be placed between, before, or after these parts.
 * NUMBER: 3
 * DESCRIPTION: Real literals suffixed by f/F (float suffix) with an exponent mark and underscores in a whole-number part, a fraction part and an exponent part.
 */

val value = 0.0_0e1_0f
val value = 0.0__0e-0___0
val value = 0.0_0E-0__0_0F

val value = 0__0.0e0f
val value = 0_0_0.0_0E0_0
val value = 00_______________00.0_0e+0_0

val value = 2_2.0e1_0F
val value = 33__3.0e10__0
val value = 4_44____4.0E0______00F
val value = 5_________555_________5.0e-9
val value = 666_666.0__________________________________________________1E+2___________________________________________________________________0F
val value = 7777777.0_0e3_0
val value = 8888888_8.000e0f
val value = 9_______9______9_____9____9___9__9_9.0E-1

val value = 0_0_0_0_0_0_0_0_0_0.12345678e+90F
val value = 1_2_3_4_5_6_7_8_9.2_3_4_5_6_7_8_9e-0
val value = 234_5_678.345______________6e7_______8f
val value = 3_456_7.45_6E7f
val value = 456.5e0_6
val value = 5.6_0E+05F
val value = 6_54.76_5e-4
val value = 7_6543.8E7654_3
val value = 876543_____________2.9E+0_____________8765432f
val value = 9_____________87654321.0e-9_8765432_____________1F

val value = 000000000000000000000000000000000000000000000000000000000000000000000000000000000000000___0.000000000000000000000000e000000000000000000000000000000000000000000000000000000000000000_0F
val value = 0_000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.0E-0___000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
val value = 9999999999999999999999999999999999999999999_______________999999999999999999999999999999999999999999999.33333333333333333333333333333333333333333333333_333333333333333333333333333333333333333e3_3f
