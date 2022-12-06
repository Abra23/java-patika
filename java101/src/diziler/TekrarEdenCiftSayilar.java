package diziler;



public class TekrarEdenCiftSayilar {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i==value){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {1, 6, 95, 95, 6, 1, 55, 65, 6, 8, 9, 11, 12, 11, 9};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++){

            for (int j = 0; j < list.length; j++){
                if ((i != j) && (list[i] == list[j])){
                    if (!isFind(duplicate,list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : duplicate){
            if (value != 0){
                System.out.println("Tekrar  eden sayýlar => "+value);
            }
        }



        for (int value : duplicate){
            if (value % 2 == 0){
                if (value == 0){
                    break;
                }
                System.out.println("\nTekrar eden çift sayýlar => "+ value);
            }

        }





    }
}
