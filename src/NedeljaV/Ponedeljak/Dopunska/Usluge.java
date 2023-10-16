package NedeljaV.Ponedeljak.Dopunska;

public interface Usluge {
    //Kreirati interfejs Usluge koja ima sledece metode:
    //-masovniPopust() - dodeljuje 20% popusta na sve artikle u svim prodavnicama
    //-nalaziSe(Artikl a) - vraca prodavnicu u kojoj se nalazi dati artikl
    //-eleminisi(Artikl a) - izbacuje dati artikl iz ponude

    void masovniPopust();
    Prodavnica nalaziSe(Artikl a);
    void eliminisi(Artikl a);
}
