package hOOP;

import java.util.Scanner;

class student {
    String name;
    int age;
    String btClass;
    Double avgScore;

    student(String name, int age, String btClass, double avgScore) {
        this.name = name;
        this.age = age;
        this.btClass = btClass;
        this.avgScore = avgScore;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Class: " + btClass);
        System.out.println("Avg Score: " + avgScore);
    }
    void dispay1(student s , Double max, Double min ) {
        if(s.avgScore <= max && s.avgScore>= min ) {
            System.out.println(s);
        }
    }
    @Override
    public String toString() {
        return name ;
    }
}

public class qlyHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student[] starr = new student[5];
        starr[0] = new student("Alice", 20, "A1", 8.5);
        starr[1] = new student("Bob", 21, "A1", 7.0);
        starr[2] = new student("Charlie", 19, "A2", 9.0);
        starr[3] = new student("David", 22, "A2", 6.5);
        starr[4] = new student("Eve", 20, "A1", 8.0);
        //Display
        System.out.println("Enter min score : ");
        double minScore = sc.nextDouble();
        System.out.println("Enter max score : ");
        double maxScore = sc.nextDouble();
        sc.close();
        for (student s : starr) {
            if (s.avgScore >= minScore && s.avgScore <= maxScore) {
                s.display();
            }

        }
        for (student s : starr) {
            s.dispay1(s,maxScore,minScore);
        }

    }
}
