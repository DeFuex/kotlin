// !LANGUAGE: +NewInference
// !DIAGNOSTICS: -UNUSED_PARAMETER

fun foo(f: () -> String) {}
fun <K> select(x: K, y: K): K = x

fun test() {
    foo { select("non-null", null) } // inferred String? but String is expected
}
