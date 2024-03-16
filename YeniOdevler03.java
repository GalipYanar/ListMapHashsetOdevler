package odevler02;

import java.util.ArrayList;
import java.util.Scanner;

public class YeniOdevler03 {
    public static void main(String[] args) {

        ArrayList<Integer>sayilar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("kaç adet sayı girilecek");
        int sayiAdedi = scan.nextInt();

        for (int i = 0; i<sayiAdedi; i++) {
            System.out.println("girilecek sayıyı yazınız");
            int a = scan.nextInt();
            sayilar.add(a);
        }

        System.out.println(sayilar);
        System.out.println("-----------");

        System.out.println("kaç adet silinecek");
        int silinecekElemanAdedi = scan.nextInt();

        for (int i =0; i<silinecekElemanAdedi;i++) {
            System.out.println("silmek istediğiniz elemanın indexini giriniz");
            int silinecekEleman = scan.nextInt();
            sayilar.remove(silinecekEleman);
        }
        System.out.println("silinmiş hali: "+ sayilar);
    }

}
