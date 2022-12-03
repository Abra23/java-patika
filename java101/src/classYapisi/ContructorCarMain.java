package classYapisi;

public class ContructorCarMain {
    public static void main(String[] args) {
        ConstructorCar audi = new ConstructorCar("Sports", "Audi", "red");
        audi.increaseSpeed(20);
        audi.printInfo();

        ConstructorCar bmw = new ConstructorCar("Sports" , "BMW" , "blue");
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printInfo();

        ConstructorCar mercedes = new ConstructorCar("Corporate" , "Mercedes" , "black");
        mercedes.speed = 20;
        mercedes.printInfo();

    }
}
