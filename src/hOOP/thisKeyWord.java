class smlMethod {
    // Thuoc tinh
    String name ;
    int age ;

    smlMethod(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public void printInf() {
        System.out.println(this.name + this.age);
    }
}

public class thisKeyWord {
    public static void main(String[] args) {
        smlMethod p2 = new smlMethod("Lieu Nhu Yen", 29);
        smlMethod p1 = new smlMethod("Vuong Lam", 3000);
        p2.printInf();
        p1.printInf();

    }
}
