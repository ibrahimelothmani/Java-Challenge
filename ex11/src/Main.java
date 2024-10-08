// The photocopying centre charges 0.25 DH for the first 10 photocopies, 0.20 DH for
//the next twenty and 0.10 DH beyond. Write a program in Java that asks the user to
//enter the number of photocopies made and displays the corresponding
//invoice.


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Entrer le nombre de papies :");
        double Nb_papies = sc.nextFloat();
        double prix=0;
        if ( Nb_papies <= 10 )
            prix = Nb_papies *0.25;
        if ( Nb_papies > 10 && Nb_papies<= 20 )
            prix = Nb_papies *0.20;
        if ( Nb_papies > 20  )
            prix = Nb_papies *0.10;
        System.out.print("Le prix total est: "+prix+" DTN");
    }
}