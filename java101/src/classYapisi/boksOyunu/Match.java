package classYapisi.boksOyunu;

public class Match {

    Fighter f1;
    Fighter f2;
    Fighter sFighter,fFigther;

    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    boolean isCheck(){
        return (this.f1.weight >= this.minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= maxWeight);
    }

    void run(){

        if (isCheck()){

            while (this.f1.health > 0 && this.f2.health > 0){

                System.out.println("********** Yeni Round **************");
                whoStarting();

                this.sFighter.health = fFigther.hit(sFighter);

                if (isWin()){
                    break;
                }

                this.f1.health = this.f2.hit(this.f1);

                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Kalan saðlýk => " + this.f1.health);
                System.out.println(this.f2.name + " Kalan saðlýk => " + this.f2.health);
            }

        }

        else {
            System.out.println("Sporcularýn sikletleri uyumusuz. ");
        }
    }


    boolean isWin(){
        if (this.f1.health ==0){
            System.out.println(this.f2.name + " Kazandý.");
            return true;
        }

        if (this.f2.health == 0){
            System.out.println(this.f1.name + " Kazandý");
            return true;
        }
        return false;

    }


    public void whoStarting(){
        int rate = (int) (Math.random()*10);
        if (rate>=0 && rate<5){
            fFigther=f1;
            sFighter=f2;
            System.out.println("\nIlk saldiriyi " + fFigther.name + " yapti. \n");
        }
        else {
            fFigther=f2;
            sFighter=f1;
            System.out.println("\nIlk saldiriyi " + fFigther.name + " yapti. \n");
        }
    }

}
