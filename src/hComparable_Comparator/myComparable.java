package hComparable_Comparator;

    import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class myComparable implements Comparable<myComparable> {
    String title;
    String author;
    int price;

    public myComparable(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int compareTo(myComparable mc) {
        return  this.title.compareTo(mc.title) ;
    }

    @Override
    public String toString() {
        //
        return String.format("Ten sach %s \n Tac gia %s \n Gia %d ", this.title, this.author, this.price);
    }

    public static void main(String[] args) {
        List<myComparable> book = new ArrayList<>();
        book.add(new myComparable("Java cơ bản", "Negishi", 2500));
        book.add(new myComparable("Java nâng cao", "Negishi", 3000));
        book.add(new myComparable("Python cơ bản", "Alice", 2000));
        book.add(new myComparable("Python nâng cao", "Alice", 3500));
        book.add(new myComparable("C++ cơ bản", "Bob", 2200));
        book.add(new myComparable("C++ nâng cao", "Bob", 2800));
        book.add(new myComparable("HTML & CSS", "Charlie", 1500));
        book.add(new myComparable("JavaScript", "Charlie", 1800));
        book.add(new myComparable("SQL cơ bản", "David", 2700));
        book.add(new myComparable("SQL nâng cao", "David", 3200));

        // Thu cac thao tac
        Collections.sort(book);
        System.out.println(book); // Sap xep thuan

        System.out.println("--------------------------------------------");

//        Collections.reverse(book);
//        System.out.println(book);


    }


}
