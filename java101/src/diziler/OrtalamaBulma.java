package diziler;

import javax.swing.*;

public class OrtalamaBulma {


    public static void main(String[] args) {
        int[] sayilar = {1,6,6,8,7};


        double sum = 0;
        double average = 0.0;


        for (int i : sayilar){
            sum += i;
        }

        System.out.println("Sayıların Toplamı => "+sum);
        average = sum / sayilar.length;
        System.out.println("Sayıların Ortalama Değeri => "+average);


    }







}
