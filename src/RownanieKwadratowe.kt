class RownanieKwadratowe(val A: Double, val B: Double, val C: Double) {
    val delta: Double;

    fun obliczDelte(): Double {
        return B * B - 4 * A * C;
    }

    fun deltaInfo(){
        if(delta>0)
            println("Delta jest większa od zero")
        if(delta==0.0)
            println("Delta wynosi zero")
        if(delta<0)
            println("Delta jest mniejsza od zero")
    }

    init {
        delta = obliczDelte()
    }
}