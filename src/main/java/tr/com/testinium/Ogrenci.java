package tr.com.testinium;

public class Ogrenci{

    String ad;
    String soyad;

    Okul okul;

    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.ad = "Ebubekir";
        ogrenci.soyad = "Durukal";
        Okul agu = new Okul();
        agu.ad = "agu";
        agu.adres = "Kayseri";
        agu.year = 2020;
        ogrenci.okul = agu;
        System.out.println(ogrenci.okul.adres);
    }
}
