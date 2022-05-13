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
        Okul agu1 = new Okul("asd",  "ad",1996);
        //agu.ad = "agu";
        agu.setAd("agu");
        //agu.adres = "Kayseri";
        agu.setAdres("Kayseri");

        System.out.println(ogrenci.okul.getAdres());
    }
}
