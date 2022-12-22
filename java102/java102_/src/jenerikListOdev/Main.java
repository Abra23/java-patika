package jenerikListOdev;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("List Status: " + (list.isEmpty() ? "Empty" : "Full"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println("List Status: " + (list.isEmpty() ? "Empty" : "Full"));

        // Get first index of list
        System.out.println("Index : " + list.indexOf(20));

        // if there is not it returns -1
        System.out.println("Index :" + list.indexOf(100));

        // Get last index of list
        System.out.println("Index : " + list.lastIndexOf(20));

        // Returns Object[] array
        Object[] arr = list.toArray();
        System.out.println("First element of object array :" + arr[0]);

        // Get sublist
        MyList<Integer> mySubList = list.subList(0, 3);
        System.out.println(mySubList.toString());

        // Check whether list have x value
        System.out.println("Check 20 : " + list.contains(20));
        System.out.println("Check 120 : " + list.contains(120));

        // Clear the list
        list.clear();
        System.out.println(list.toString());

    }
}
