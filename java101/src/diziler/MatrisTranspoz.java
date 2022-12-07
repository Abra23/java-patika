package diziler;

import java.util.Scanner;

public class MatrisTranspoz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Satýr sayýsýný giriniz => ");
        int rowNumnber = scanner.nextInt();

        System.out.print("Sütün sayýsýný giriniz => ");
        int columnNumber = scanner.nextInt();

        int[][] matris = new int[rowNumnber][columnNumber];
        int[][] transpoze = new int[columnNumber][rowNumnber];


        for (int i = 0; i < rowNumnber; i++){
            for (int j = 0; j < columnNumber; j++){
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]. Eleman = ");
                matris[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Matris ==>");

        for (int i[] : matris){
            for (int j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }


        System.out.println("\nTranspose ==>");
        for (int i = 0; i < columnNumber; i++){
            for (int j = 0; j < rowNumnber; j++){
                transpoze[i][j] = matris[j][i];
                System.out.print(transpoze[i][j] + "\t");
            }
            System.out.println();
        }






    }

}
