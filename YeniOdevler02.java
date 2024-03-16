package odevler02;

import java.util.HashMap;
import java.util.Scanner;

public class YeniOdevler02 {

    public static void main(String[] args) {

        HashMap<String,Integer> phoneNumbers = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç Adet Numara Tanımlamak istiyorsunuz: ");
        int numberOfPhone = scanner.nextInt();
        for (int i=0;i<numberOfPhone;i++)
        {
            System.out.print("İsim: ");
            String numberName= scanner.next();
            System.out.print("Numara: ");
            int phoneNumber = scanner.nextInt();
            phoneNumbers.put(numberName,phoneNumber);
        }
        System.out.println(phoneNumbers);

        for (int i=0; i<numberOfPhone; i++) {
            System.out.println("Aramak istediğiniz adı giriniz: ");
            String searchingNumbers = scanner.next();
            System.out.println(phoneNumbers.get(searchingNumbers));
            if (phoneNumbers.get(searchingNumbers) == null){
                System.out.println("kişi rehberde yok");
            }
        }
    }
}
