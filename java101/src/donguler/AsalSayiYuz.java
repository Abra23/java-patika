package donguler;

public class AsalSayiYuz {

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean asalMi = true;
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.print(i + " ");
            }
        }


    }
}
