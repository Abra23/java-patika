package classYapisi.maasHesaplayici;

public class Employee {

    String name; // Çalýþan ismi
    double salary; // maasi
    int workHours; // Haftalýk çalýþma saati
    int hireYear; // iþe baþlama yýlý


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary < 1000){
            return 0;
        }
        return (this.salary * 3) / 100;

    }

    double bonus(){
        if (this.workHours > 40){
            return (this.workHours - 40) * 30 ;
        }

        return 0;
    }


    double raiseSalary(){
        int nowYear = 2021;

        if (nowYear - this.hireYear < 10){
            return (this.salary * 5) / 100;
        }

        else if( nowYear - this.hireYear >= 10 && nowYear - this.hireYear < 20){
            return (this.salary * 10) / 100;
        }

        else if(nowYear - this.hireYear >= 20){
            return  (this.salary * 15) / 100;
        }

        return 0;


    }


   void printInfo(){
        System.out.println("Çalýþanýn adý => "+this.name);
        System.out.println("Çalýþanýn maaþý => "+this.salary);
        System.out.println("Haftalýk çalýþma saati => "+this.workHours);
        System.out.println("Ýþe baþlangýç yýlý => "+this.hireYear);
        System.out.println("Vergi Ücreti => "+tax());
        System.out.println("Bonus Ücret => "+bonus());
        System.out.println("Maaþ Zam Ücrerti => "+raiseSalary());
        System.out.println("Vergi ve Bonus Sonrasý Maaþ =>"+(this.salary - tax() + bonus()) );
        System.out.println("Tüm iþlemler sonrasý maaþ durumu => "+(this.salary  + raiseSalary()));
   }


}
