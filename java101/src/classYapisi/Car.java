package classYapisi;

public class Car {

    // Nitelikler

    String type;
    String model;
    String color;
    int speed;
    int speedLiimit = 150;

    void increaseSpeed(int increment){
        if ((speed + increment) < speedLiimit){
            speed += increment;
        }
        else {
            speed = speedLiimit;
        }
    }

    void decreaseSpeed (int decresment){
        if (speed > 0 ){
            speed -= decresment;
        }
    }

    void  printSpeed(){
        System.out.println("Şuanki hızınız ==> "+speed);
    }


}
