package in;

public class student {
    String name ;
    int age ;
    Double avgScore ;

    public student(String name, int age, Double avgScore) {
        this.name = name;
        this.age = age;
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return String.format("Ten hoc sinh : %s \n Tuoi : %s \n Diem trung binh %f "
                ,this.name , this.age, this.avgScore) ;
    }
}
