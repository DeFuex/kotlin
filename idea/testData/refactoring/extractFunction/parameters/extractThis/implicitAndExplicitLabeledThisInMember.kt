// PARAM_TYPES: A
// PARAM_TYPES: A.B
// PARAM_DESCRIPTOR: public final class A : Z defined in root package in file implicitAndExplicitLabeledThisInMember.kt
// PARAM_DESCRIPTOR: public final inner class B : Z defined in A
public open class Z {
    val z: Int = 0
}

// SIBLING:
public class A(): Z() {
    var a: Int = 1

    public inner class B(): Z() {
        var b: Int = 1

        fun foo(): Int {
            return <selection>a + b + this@A.z + this@B.z</selection>
        }
    }
}
