package classYapisi.ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Usame YILDIZ","TRH","555");
        Teacher t2 = new Teacher("Ali YILDIZ","FZK","000");
        Teacher t3 = new Teacher("Külyutmaz","BIO","111");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,50,60,50,60,40);
        s1.isPass();

        Student s2 = new Student("Güdük Nedmi","456","4",tarih,fizik,biyo);
        s2.addBulkExamNote(40,36,45,80,90,20);
        s2.isPass();

    }
}
