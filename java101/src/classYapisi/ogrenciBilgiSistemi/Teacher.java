package classYapisi.ogrenciBilgiSistemi;

public class Teacher {
    String name;
    String mpno;
    String branch;


    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void printTeacher(){
        System.out.println("Adı : "+this.name);
        System.out.println("Telefonu : "+this.mpno);
        System.out.println("Branşı : "+this.branch);
    }



}
