package hCollections;

import java.util.LinkedList;

public class demoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> myLinkerList = new LinkedList<>() ;
        myLinkerList.add("Money");
        myLinkerList.add("Love");
        myLinkerList.add("Family");
        myLinkerList.add("Oxi");
        myLinkerList.add("Hobby");
        System.out.println(myLinkerList);
        System.out.println("Get fist" + myLinkerList.getFirst() + "\n  Get last " + myLinkerList.getLast());

    }
}
//
//Dùng LinkedList khi:
//Cần thêm/xóa phần tử thường xuyên ở đầu/cuối/một vị trí bất kỳ
//Không cần truy cập phần tử nhiều theo chỉ số
//Tránh dùng LinkedList khi:
//Cần truy cập phần tử thường xuyên theo chỉ số (vì chậm hơn)
