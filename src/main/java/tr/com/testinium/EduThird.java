package tr.com.testinium;

import java.util.Scanner;

public class EduThird {
    public static void main(String[] args) {
        //System.out.println("Para miktarını giriniz");
        Scanner sc = new Scanner(System.in);
        int benimParam = 5;

        int benimBorcum = 50;
        if (benimParam < benimBorcum) {
            // System.out.println("Borcunuz vardır");
        } else if (benimParam == benimBorcum) {
            // System.out.println("0 liranız vardır");
        } else {
            //System.out.println("Borcunuz yoktur");
        }

        int p = 3;
        int m = 5;
        int buyuk = 0;
/*        if (p > m) {
            buyuk = p;
        } else {
            buyuk = m;
        }*/

        buyuk = p > m ? p : m; // ternary operator

        //System.out.println(buyuk);


        int x = 2;
//        switch (x) {
//            case 1:
//                System.out.println("x değeri 1 dir");
//                break;
//            case 2:
//                System.out.println("x değeri 2 dir");
//                break;
//            case 3:
//                System.out.println("x değeri 3 dir");
//                break;
//            default:
//                System.out.println("başka bir değerdir");
//        }

        for (int i = 0; i < 10; i++) {
            //System.out.println(i);
        }
        for (int i = 0; i < 100; i = i + 2) {
            //System.out.print(i + " - ");
        }

        int[] arr = {1, 4, 6};
        for (int eleman : arr) {
            //System.out.println(eleman);
        }

        int i = 0;

        while (i < -10) {
            System.out.println(i);
            i++;
        }


        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < -10);

        test:
        for (int q = 1; q < 11; q++) {
            test2:
            for (int v = 1; v < 11; v++) {
                System.out.print(q * v + "   ");
                if(v == 5){
                    break test;
                }
            }
            System.out.println();
        }

//        for (int b = 1; b < 11; b++) {
//            if(b == 5){
//                break;
//            }
//            System.out.println(b);
//        }

        }
    }
