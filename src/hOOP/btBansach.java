package hOOP;

class Book {
    //Thuoc tinh
    private String author;
    private String title;
    private int price;



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price can't be negative");
        }else {
            this.price = price;

        }
    }


}

public class btBansach {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setAuthor("John Doe");
        myBook.setTitle("The Death Note");
        myBook.setPrice(100);

        //in thong tin sach
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Price: " + myBook.getPrice());

            //Thu ghi ngoai le
        myBook.setPrice(-200);
    }
}
