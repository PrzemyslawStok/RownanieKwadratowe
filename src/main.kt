fun main(){
    //5x^2+x+4
    val rownanieKwadratowe = RownanieKwadratowe(0.5,1.0,0.5)
    val rownanie1 = RownanieKwadratowe(5.0,1.0,1.0)


    rownanieKwadratowe.deltaInfo()
    rownanieKwadratowe.wyswietlRozwiazania();

    rownanie1.wyswietlRozwiazania()

    //a*x^2+b*x+c=0
    //delta = b^2-4*a*c
    //b^2-4*a*c=0
    //b^2=4*a*c
    //1/4*b^2=a*c
    //zakładamy że a=c
    //1/4*b^2=a^2
    //b^2=4*a^2
    //zał. że b=1
    //1=4*a^2
    //czyli a=1/2 lub a=-1/2
    //zał. że b=2
    //2^2=4*a^2
    //4=4*a^2
    //1=a^2
    //a=1
}