package test

interface Some

abstract class My<T : Some> {
    inner class T

    abstract val x: T

    abstract fun foo(arg: T)

    abstract val y: My.T

    abstract val z: test.My.T

    class Some : <!OTHER_ERROR, UNRESOLVED_REFERENCE!>T<!>()
}

abstract class Your<T : Some> : <!OTHER_ERROR!>T<!>
