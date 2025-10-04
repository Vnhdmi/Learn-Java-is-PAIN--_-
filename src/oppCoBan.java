class Animal {
    String name;
    int age;
    void  review (){
        System.out.printf("Welcome to the zoo \n is %s and %s years old.",name,age);
    }
}
public class oppCoBan {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "Tiger" ;
        a.age = 18;
        a.review();
    }

}
