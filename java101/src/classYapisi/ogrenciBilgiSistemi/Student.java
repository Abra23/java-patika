package classYapisi.ogrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String studentNo;
    String classes;
    double avarage = 0.0;
    boolean isPass;


    Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int quiz1, int quiz2, int quiz3){
        if(note1 >= 0 && note1 <= 100 ){
            this.c1.note = note1;
        }
        if(quiz1 >= 0 && quiz1 <= 100 ){
            this.c1.quiz = quiz1;
        }

        if(note2 >= 0 && note2 <= 100 ){
            this.c2.note = note2;
        }

        if(quiz2 >= 0 && quiz2 <= 100 ){
            this.c2.quiz = quiz2;
        }

        if(note3 >= 0 && note3 <= 100 ){
            this.c3.note = note3;
        }

        if(quiz3 >= 0 && quiz3 <= 100 ){
            this.c3.quiz = quiz3;
        }

    }

    void calcAverage(){
        this.avarage = (((this.c1.note + this.c2.note + this.c3.note)*0.8)+((this.c1.quiz + this.c2.quiz + this.c3.quiz)*0.2)) / 3.0;

    }

    void isPass(){
        calcAverage();
        printNote();
        if(this.avarage >= 55){
            System.out.println("Tebrikler sýnýfý geçtiniz ");
            this.isPass = true;
        }
        else{
            System.out.println("Sýnýfta kaldýnýz...");
        }
    }

    void printNote(){
        System.out.println("*********************************");
        System.out.println("Öðrenci Bilgileri ==>  " +this.name+" // "+this.studentNo);
        System.out.println(this.c1.name+" ders notu => "+this.c1.note+" // Quiz notu ==> "+this.c1.quiz );
        System.out.println(this.c2.name+" ders notu => "+this.c2.note+" // Quiz notu ==> "+this.c2.quiz );
        System.out.println(this.c3.name+" ders notu => "+this.c3.note+" // Quiz notu ==> "+this.c3.quiz);
        System.out.println("Sýnýf ortalamanýz => "+this.avarage);


    }






}
