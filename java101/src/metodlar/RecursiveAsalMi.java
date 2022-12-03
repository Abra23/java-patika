package metodlar;

import java.util.Scanner;

public class RecursiveAsalMi {

    static boolean asalMi(int sayi, int bolen ){

        if(sayi == bolen){
            System.out.println(sayi+" sayısı asaldır. ");
            return true;
        }

        else if(sayi % bolen == 0){
            System.out.println(sayi+" sayısı asal değildir.");
            return false;
        }

        return asalMi(sayi,bolen+1);


    }

    public static void main(String[] args) {
        int sayi, bolen = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz ==> ");
        sayi = scanner.nextInt();

        asalMi(sayi,bolen);
    }




}
