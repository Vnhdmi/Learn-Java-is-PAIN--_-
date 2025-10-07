package hComparable_Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class myComparator implements Comparator<myComparator> {

    String title;

    public int getPrice() {
        return price;
    }

    String author;
    int price;

    public myComparator(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public int compare(myComparator c1 , myComparator c2) {
        return c1.price - c2.price ;
    }
    @Override
    public String toString() {
        return "myComparator{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';

    }

    public static void main(String[] args) {
        List <myComparator> books = new ArrayList<>();
        books.add(new myComparator("Java cơ bản", "Negishi", 2500));
        books.add(new myComparator("Java nâng cao", "Negishi", 3000));
        books.add(new myComparator("Python cơ bản", "Alice", 2000));
        books.add(new myComparator("Python nâng cao", "Alice", 3500));
        books.add(new myComparator("C++ cơ bản", "Bob", 2200));
        books.add(new myComparator("C++ nâng cao", "Bob", 2800));
        books.add(new myComparator("HTML & CSS", "Charlie", 1500));
        books.add(new myComparator("JavaScript", "Charlie", 1800));
        books.add(new myComparator("SQL cơ bản", "David", 2700));
        books.add(new myComparator("SQL nâng cao", "David", 3200));
        System.out.println(books);
//        books.stream().sorted(Comparator.comparing(books::).forEach();
        
    }
}
