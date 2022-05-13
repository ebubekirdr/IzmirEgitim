package tr.com.testinium;

public class Matematik {
    public static void main(String[] args) {
        System.out.println(topla(4, 3, 2, 1));
    }


    public static int topla(int... deger) {
        int toplam = 0;
        for (int i : deger) {
            toplam += i; // toplam = toplam + i;
        }
        return toplam;
    }

}
