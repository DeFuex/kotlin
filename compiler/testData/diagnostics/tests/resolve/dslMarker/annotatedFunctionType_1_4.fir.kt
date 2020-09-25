// !DIAGNOSTICS: -UNUSED_PARAMETER
// !LANGUAGE: +DslMarkerOnFunctionTypeReceiver
// !WITH_NEW_INFERENCE

@Target(AnnotationTarget.TYPE)
@DslMarker
annotation class MyDsl

interface A {
    fun foo()
}

interface B {
    fun bar()
}

fun baz1(x: (@MyDsl A).() -> Unit) {}
fun baz2(x: (@MyDsl B).() -> Unit) {}
fun baz3(x: @MyDsl A.() -> Unit) {}
fun baz4(x: @MyDsl B.() -> Unit) {}

fun @MyDsl A.baz5() {
    baz4 {
        bar()
        foo()
    }
}

fun main() {
    baz1 {
        baz2 {
            bar()
            foo()
        }
    }

    baz3 {
        baz2 {
            bar()
            foo()
        }
    }

    baz1 {
        baz4 {
            bar()
            foo()
        }
    }

    baz3 {
        baz4 {
            bar()
            foo()
        }
    }

}
