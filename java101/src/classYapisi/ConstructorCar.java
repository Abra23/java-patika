package classYapisi;

public class ConstructorCar {
    // nitelikler

    // sınıfa ait olan herhangi bir parametre kullanıldığı zaman metotların içerisinde this ifadesi kullanılmalıdır.



    String type;
    String model;
    String color;
    int speed;

    // Constructor (Kurucu) Metot
    ConstructorCar(String type, String model, String color) {
        this.type = type; // this ifadesi sınıf içinde tanımlanan parametreyi ifade eder.
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    // davranışlar
    int increaseSpeed(int increment) {
        this.speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return this.speed;
    }

    void printSpeed() {
        System.out.println("Speed : " + this.speed);
    }

    void printInfo() {
        System.out.println("================");
        System.out.println("Model  : " + this.model);
        System.out.println("Color  : " + this.color);
        System.out.println("Type  : " + this.type);
        System.out.println("Speed  : " + this.speed);
    }
}
