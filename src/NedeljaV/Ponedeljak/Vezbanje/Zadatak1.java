package NedeljaV.Ponedeljak.Vezbanje;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
        Test OOP:
Kreirati Klasu Student koja ima sledece parametre:
-(String) Ime
-(List<Integer>) Listu ocena
-(int) Trenutnu godinu studiranja
Takodje poseduje metodu prosek() koja vraca prosek svih njegovih ocena;
Napraviti abstraktnu klasu Departman koja ima sledece atribute:
-(List<Student>) Listu studenata
-(String) naziv
Kreirati metode:
List<Student> vredni(int prosek) - Metoda koja vraca listu Studenata koji imaju veci prosek
od prosledjenog.
double prosekSvih() - Metoda koja vraca prosek svih Studenata sa Departmana.
double finansije() - Ova metoda je abstraktna. Vraca ukupan broj zarade od fakulteta, ako
racunamo da na svakom Departmanu 50% mesta su budzetska(besplatna), osim na
Departmanu za Biologije gde nema ni jedno budzetsko mesto.
Napraviti klase Biologija, Informatika i Hemija koje nasledjuju klasu Departman.
Skolarina po Studentu za Biologiju-3000, za Hemiju-4000 a Informatika-5000 //65 bodova
Napraviti Interfejs Studije koje implementiraju metode:
-void dodajStudenta(Departman d, Student s) - Dodaje odgovarajuceg studenta u listu iz
Departmana.
-void izbaciStudenta(Departman d, Student s) - Izbacuje studenta iz liste za odredjen
Departman
-Departman najvecaZarada() - Vraca departman koji donosi najvise para fakultetu
-List<Student> sviApsolventi() - Vraca listu studenata koji su cetvrta godina
Klasa Fakultet implementira interfejs Studije i kao argument ima listu departmana. //35 bod
Kreirati za sve klase dodatne get i set metode, kao toString i konstruktore. // 5 bodova
         */

        ArrayList<Integer> listaOcena1 = new ArrayList<>();
        listaOcena1.add(5);
        listaOcena1.add(5);
        listaOcena1.add(4);
        listaOcena1.add(4);

        Student student1 = new Student("Aleksandra", listaOcena1, 3 );
        System.out.println(student1);
        System.out.println("----------");
        System.out.println(student1.prosek());
        System.out.println("----------");
        System.out.println();

        ArrayList<Student> listaStudenata1 = new ArrayList<>();
        listaStudenata1.add(student1);

        Departman biologija = new Biologija(listaStudenata1, "biologija");

        System.out.println(biologija.finansije());
        System.out.println("----------");

    }
}
