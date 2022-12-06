package diziler;

public class HarmonikOrtalama {

    public static void main(String[] args) {

        double[] list = {13,92,86,91,13,84};

        int adet = list.length;

        double harmonikSeri = 0.0;

        for (int i = 0; i < list.length; i++ ){
           harmonikSeri += (1 / list[i]);
        }

        double harmonikOrtalama = adet / harmonikSeri;
        System.out.println(harmonikOrtalama);


    }


}
