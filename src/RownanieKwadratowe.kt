import kotlin.math.sqrt

class RownanieKwadratowe(val a: Double, val b: Double, val c: Double) {
    val delta: Double

    var x0 = 0.0
    var x1 = 0.0
    var x2 = 0.0

    fun obliczDelte(): Double {
        return b * b - 4 * a * c
    }

    fun obliczDwaRozwiazania() {
        x1 = (-b + sqrt(delta)) / (2 * a)
        x2 = (b + sqrt(delta)) / (2 * a)
    }

    fun obliczJednoRozwiazanie() {
        x0 = -b / (2 * a)

    }

    fun deltaInfo() {
        if (delta > 0)
            println("Delta jest większa od zero")
        if (delta == 0.0)
            println("Delta wynosi zero")
        if (delta < 0)
            println("Delta jest mniejsza od zero")
    }

    fun oblicz() {
        if (delta > 0)
            obliczDwaRozwiazania()
        if (delta == 0.0)
            obliczJednoRozwiazanie()
        if (delta < 0)
            return
    }

    init {
        delta = obliczDelte()
    }
}