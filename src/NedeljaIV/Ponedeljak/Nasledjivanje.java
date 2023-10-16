package NedeljaIV.Ponedeljak;

public class Nasledjivanje {
    /*
    Nasledjivanje
    extends - kljucna rec koja govori da jedna klasa nasledjuje drugu klasu
    A - neka klasa
    bublic clas B extends A{
    neki kod

    }
    ovim smo iskazali da klasa B nasledjuje klasu A
    Dakle klasa A je hijerarhijski visa od klase B
    Ali je klasa B specificnija od klase A- ima vise atributa

    -- kazemo da je B podklasa klase A
    odnosno da je A nadklasa klase B

    Q:
    1. Sta ce sve naslediti klasa b od klase a?
    - sve sto mu je vidljivo(Sve sto je public)
    2. Sta ce se desiti ako klasa Ucenik nasledi klasu osoba ali svi atributi u klasi ucenik su tipa boolean?
    - klasa ucenik ce imati uniju svih atributa iz klase osoba
    3. Da li mogu tek tako da kkreiram objekat klase b?
    - prvo kreiramo objekat klase a pa tek onda objekat klase b, koji ce biti podobjekat objekta a

    svaka klasa moze da nasledi najvise jednu drugu klasu- ali moze da ima koliko hoce podklasa
    dozvoljeno: b extends a
    nedozvoljeno: c extends a, b

    --Method overriding
    class A{....; public voidf(){}....}
    class B extends A{ ....; public void f(){} ....}
    class C extends B{ ....; public void f(){} ....}


    C objC = new C();
    c.f(); - poziva se metoda impelementacije metode f koja je najniza u hijerarhiji klasa

    -- method overriding- klasa redefinise ponasanje metode koju najsledjuje iz nadklase

    -- svaka klasa u javi prosiruje object klasu


     */

}
