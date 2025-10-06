package bt_Clollections_Qlysv;

import java.util.Scanner;

public class studentInfo {
    String name;
    int age;
    Double avgScore;

    //TODO lam xu ky khu nhap sai
    studentInfo(String name, int age, Double avgScore) {
        this.age = age ;
        this.name = name;
        this.avgScore = avgScore ;
    }

    @Override
    public String toString() {
        return "studentInfo{" + "name='" + this.name + '\'' + ", age=" + this.age + ", avgScore=" + this.avgScore + '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        new studentInfo(checkInput.checkName(sc,"Hay nhap ten"),
                checkInput.checkAge(sc),
                checkInput.checkAvg(sc));

    }

}


