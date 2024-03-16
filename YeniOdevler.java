package odevler02;

import java.util.ArrayList;
import java.util.Scanner;

public class YeniOdevler {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        System.out.println("Array1 Kaç Elemanlı olsun: ");
        int arrayList1Size = scanner.nextInt();
        System.out.println("Array1 için değerleri giriniz: ");

        for (int i = 0; i < arrayList1Size; i++) {
            int arrayList1Numbers = scanner.nextInt();
            arrayList1.add(arrayList1Numbers);
        }

        System.out.println("Array2 Kaç Elemanlı olsun: ");
        int arrayList2Size = scanner.nextInt();
        System.out.println("Array2 için değerleri giriniz: ");
        for (int i = 0; i < arrayList2Size; i++) {
            int arrayList2Numbers = scanner.nextInt();
            arrayList2.add(arrayList2Numbers);
        }

        System.out.println("Array3 Kaç Elemanlı olsun: ");
        int arrayList3Size = scanner.nextInt();
        System.out.println("Array3 için değerleri giriniz: ");
        for (int i = 0; i < arrayList3Size; i++) {
            int arrayList3Numbers = scanner.nextInt();
            arrayList3.add(arrayList3Numbers);
        }

        System.out.println(arrayList1);
        System.out.println(arrayList2);
        System.out.println(arrayList3);

        System.out.println("Kontrol Etmek istediğiniz Dizi:Değer Araması Yapınız: ");

        int controlArray = scanner.nextInt();
        int controlNumber = scanner.nextInt();

        controlNumber = controlNumber - 1;

        if (controlArray == 1) {
            if (arrayList1.get(controlNumber) == null) {
                System.out.println("ERROR!");
            } else {
                System.out.println(arrayList1.get(controlNumber));
            }
        } else if (controlArray == 2) {
            if (arrayList2.get(controlNumber) == null) {
                System.out.println("ERROR!");
            } else {
                System.out.println(arrayList2.get(controlNumber));
            }
        } else if (controlArray == 3) {
            if (arrayList3.get(controlNumber) == null || controlArray > arrayList3Size) {
                System.out.println("ERROR!");
            } else {
                System.out.println(arrayList3.get(controlNumber));
            }
        } else {
            System.out.println("ERROR!");
        }
    }
}