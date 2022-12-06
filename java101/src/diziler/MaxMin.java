package diziler;

public class MaxMin {

    public static void main(String[] args) {
        int[] list = {12, 51, 884 ,84 ,84, -5};

        int min = list[0];
        int max = list[0];

        for (int number: list){
            if (number < min){
                min = number;
            }

            if (number > max) {
                max = number;
            }

        }

        System.out.println("Max Değer => " + max);
        System.out.println("Min Değer => " + min);

    }

}
