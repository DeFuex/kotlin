// !WITH_NEW_INFERENCE
class X

operator fun <T> X.iterator(): Iterable<T> = TODO()

fun test() {
    for (i in <!NI;ITERATOR_MISSING, OI;TYPE_INFERENCE_NO_INFORMATION_FOR_PARAMETER!>X()<!>) {
    }
}