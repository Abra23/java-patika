package kosulluIfadeler;

import java.util.Scanner;

public class SayiSirala {
    public static void main(String[] args) {

        int sayi1, sayi2, sayi3;
        Scanner scanner = new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz: ");
        sayi1 = scanner.nextInt();

        System.out.print("2.Sayıyı giriniz: ");
        sayi2 = scanner.nextInt();

        System.out.print("3.Sayıyı giriniz: ");
        sayi3 = scanner.nextInt();

        if((sayi1 > sayi2) && (sayi1 > sayi3)){
            if(sayi2 > sayi3 ){
                System.out.print("Sayi1 > Sayi2 > Sayi3");
            }
            else {
                System.out.print("Sayi1 > Sayi3 > Sayi2");
            }
        }


        else if ((sayi2 > sayi3) && (sayi2 > sayi1)){

            if(sayi1 > sayi3){
                System.out.print("Sayi2 > Sayi1 > Sayi3");
            }

            else{
                System.out.print("Sayi2 > Sayi3 > Sayi1");
            }
        }

        else{
            if(sayi1 > sayi2){
                System.out.print("Sayi3 > Sayi1 > Sayi2");
            }
            else{
                System.out.print("Sayi3 > Sayi2 > Sayi1");
            }
        }



    }
}
