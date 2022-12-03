package donguler;

import javax.swing.text.html.CSS;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int sayi1 , sayi2 ,ebob = 0 , ekok = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz => ");
        sayi1 = scanner.nextInt();

        System.out.println("2. sayıyı giriniz => ");
        sayi2 = scanner.nextInt();

        for(int i = 1 ; i <= sayi1; i++ ){
            if(sayi1 % i == 0 && sayi2 % i ==0){
                ebob=i;
            }
        }


        for (int i = 1 ; i <= (sayi1*sayi2);i++){
            if (i % sayi1 == 0 && i % sayi2 == 0){
                ekok = i;
            }
        }



        System.out.println("Ebob degeri =>  "+ebob);

        System.out.println("Ekok degeri =>  "+ekok);




    }
}
