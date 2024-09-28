// A shop offers these customers a 15% discount for purchase amounts over 200 dh.
//Write a program in Java to enter the total price excluding VAT and calculate the
//amount including VAT taking into account the reduction and VAT = 20%.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("purchase amounts");
       double total = scanner.nextFloat();
       double total2 = (total + total *0.2);
       if (total2 > 200) {
           total2 = total2 - total2*0.15;
           System.out.println("total price "+ total2);
       }else
           System.out.println("total price " + total2);
   }
}

// import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Entrerle montant HT:");
//        double Prix_HT = sc.nextFloat();
//
//        double Prix_TTC = Prix_HT + Prix_HT*0.2;
//        if ( Prix_TTC > 200 ) {
//            Prix_TTC = Prix_TTC - Prix_TTC*0.15;
//            System.out.print("le montant TTC est: "+Prix_TTC);
//        }else{
//            System.out.print("le montant TTC est: "+ Prix_TTC);
//        }
//    }
//}