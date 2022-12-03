package donguler;

import java.util.Scanner;

public class BolunenlerOrtalama {
    public static void main(String[] args) {
        int number;
        double avarage=0, count=0, total=0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz:  ");
        number = scanner.nextInt();

        for (int i=1; i<=number;i++){
            if ((i%3==0)&&(i%4==0)){
                count+=1;
                total+=i;
                System.out.println("3 ve 4 e bölenleri :  "+i+" ");
            }
        }
        avarage = total / count;

        System.out.println("Toplamları : "+total);
        System.out.println("Ortalamaları : "+avarage);






    }
}