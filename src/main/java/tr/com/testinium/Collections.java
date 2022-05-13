package tr.com.testinium;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,-5,-10};
        Arrays.sort(arr);
        for (int a:arr
             ) {
            System.out.print(a + " ");
        }
        int[] arr2 = new int[3];
        arr2[0] = 4;
        arr2[1] = 4;
        arr2[2] = 4;
        Ogrenci ebubekir = new Ogrenci();
        Ogrenci[] sinif = new Ogrenci[3];
        sinif[0] = new Ogrenci();
        sinif[1] = ebubekir;

        for(Ogrenci ogr: sinif){
            //System.out.println(ogr.ad);
        }

        int[][] matris = new int[20][5];
        int[][][] triple = new int[3][3][3];
        matris[0][0] =2;
        matris[1][1] =3;
        System.out.println(matris[0][0]);

        ArrayList<String> a  = new ArrayList();
        a.add("Ebubekir");
        a.add("Mehmet");
        a.add("Melih");


    }
}
