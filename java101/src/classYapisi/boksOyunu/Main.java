package classYapisi.boksOyunu;

public class Main {

    public static void main(String[] args) {

        Fighter f1 = new Fighter("K�rm�z�",12,120,90,40);
        Fighter f2 = new Fighter("Mavi",15,90,80,20);


        Match match = new Match(f1,f2,80,100);
        match.run();

    }

}
