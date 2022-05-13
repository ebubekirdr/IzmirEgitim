package tr.com.testinium;

public class EduTwo {
    // Bu sınıf ikinci ders için

    byte a = 1;
    short b = 45;
    int c = 32;
    long d = 90L;
    float e = 43.0f;
    double f = 43.4;
    char g = 'p';
    boolean h = true;

    // yanlışlar
    // boolean Ornek = false; // Yazım standartına uymaz
    // boolean -deneme = true;
    // boolean 4asdf = false;
    // boolean float = true;

    // doğrular
    boolean _fas = true;
    boolean $ornek = true;

    // Wrapper types;

    Integer i = 5;
    Integer j = new Integer(5);

    String ss = new String();
    String s = "Bu bir string cümlesi örneği";

    Boolean bl = true;

    int x, y, z; // yapalabilir ama tavsiye edilmez.


    public static void main(String[] args) {
        int i = 5;
        long l = i;

        i = (int) l; // type casting
        // i = l; çalışmaz

        byte by = 4;
        int in = 130;

        by = (byte) in;
        //byte by =4; scope
        //System.out.println(by);

        double tr = 4;
        double ty = 5;
        double toplam = tr / ty;
        System.out.println(toplam);
        ;
        toplam++; // toplam = toplam + 1;
        toplam += 5; // toplam = toplam + 5;
        //System.out.println(toplam);

        int deger = 10;
        System.out.println(++deger);
        System.out.println(deger);

        boolean deger1 = 4 == 3;


    }


}
