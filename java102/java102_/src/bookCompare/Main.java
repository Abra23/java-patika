package bookCompare;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>(new ComparatorByPage());

        Book book1 = new Book("Ýlmin Fazileti","Ýmam Gazali",534,2020);
        Book book2 = new Book("Kuantum Uzayý","Jým Baggot",320,2018);
        Book book3 = new Book("Evrim Nedir","Ernst Myaer",452,1997);
        Book book4 = new Book("Þeker Portakalý","Jose Mauro",183,1968);
        Book book5 = new Book("Fahrenaeit 451","Ray Barudy",350,1953);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println("------------------- Sayfa Sayýsýna Göre Sýrlama -------------------------- (Küçükten Büyüðe) ");

        for (Book book : books){
            System.out.println(""+book.getBookName()+"\t\t\t\t|\t\t\t\t"+book.getAuthorName()+"\t\t\t\t|\t\t\t\t"+book.getPageNumber()+"\t\t\t\t|\t\t\t\t"+book.getDate());
        }


        System.out.println("-------------------------------------------------------------------------------------------------");



        TreeSet<Book> bookByName = new TreeSet<>(new ComparatorByName());

        bookByName.add(book1);
        bookByName.add(book2);
        bookByName.add(book3);
        bookByName.add(book4);
        bookByName.add(book5);


        System.out.println("------------------- Kitap Ýsmine  Göre Sýrlama --------------------------  ");

        for (Book bookN : bookByName){
            System.out.println(""+bookN.getBookName()+"\t\t\t\t|\t\t\t\t"+bookN.getAuthorName()+"\t\t\t\t|\t\t\t\t"+bookN.getPageNumber()+"\t\t\t\t|\t\t\t\t"+bookN.getDate());
        }



    }
}
