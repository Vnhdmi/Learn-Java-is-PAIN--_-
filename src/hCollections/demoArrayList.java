package hCollections;

import java.util.ArrayList;

public class demoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(8);
        System.out.println( "Day goc" + myArrayList);
        // Xoa phan tu tai vi tri dau tien
        myArrayList.remove(5) ;
        System.out.println("Sau khi xoa" + myArrayList);

        // Them vao vi tri chi dinh
        myArrayList.add(3,3) ;
        System.out.println("Sau khi them tai vi tri chi dinh 3 " + myArrayList);

    }
}
