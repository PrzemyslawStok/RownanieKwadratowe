class RownanieKwadratowe(val A: Double, val B: Double, val C: Double) {
    val delta: Double;

    var x0 = 0.0;
    var x1 = 0.0;

    fun obliczDelte(): Double {
        return B * B - 4 * A * C;
    }

    fun obliczDwaRozwiazania(){

    }

    fun obliczJednoRozwiazanie(){

    }

    fun deltaInfo(){
        if(delta>0)
            println("Delta jest większa od zero")
        if(delta==0.0)
            println("Delta wynosi zero")
        if(delta<0)
            println("Delta jest mniejsza od zero")
    }

    fun oblicz(){
        if(delta>0)
            obliczDwaRozwiazania()
        if(delta==0.0)
            obliczJednoRozwiazanie()
        if(delta<0)
            return
    }

    init {
        delta = obliczDelte()
    }
}