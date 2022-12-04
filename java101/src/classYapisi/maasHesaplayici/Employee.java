package classYapisi.maasHesaplayici;

public class Employee {

    String name; // �al��an ismi
    double salary; // maasi
    int workHours; // Haftal�k �al��ma saati
    int hireYear; // i�e ba�lama y�l�


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
        System.out.println("�al��an�n ad� => "+this.name);
        System.out.println("�al��an�n maa�� => "+this.salary);
        System.out.println("Haftal�k �al��ma saati => "+this.workHours);
        System.out.println("��e ba�lang�� y�l� => "+this.hireYear);
        System.out.println("Vergi �creti => "+tax());
        System.out.println("Bonus �cret => "+bonus());
        System.out.println("Maa� Zam �crerti => "+raiseSalary());
        System.out.println("Vergi ve Bonus Sonras� Maa� =>"+(this.salary - tax() + bonus()) );
        System.out.println("T�m i�lemler sonras� maa� durumu => "+(this.salary  + raiseSalary()));
   }


}
