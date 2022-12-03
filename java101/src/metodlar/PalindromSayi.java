package metodlar;

public class PalindromSayi {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0){
            System.out.println("---------------------------");
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println(reverseNumber);
            temp /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        isPalindrom(247);
    }
}
