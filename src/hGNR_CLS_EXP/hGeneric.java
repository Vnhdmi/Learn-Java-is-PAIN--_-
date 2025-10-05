package hGNR_CLS_EXP;


public class hGeneric  {

    public static void main(String[] args) {
    boxOfClassGeneric<String> box1 = new boxOfClassGeneric<>();
    boxOfClassGeneric<Integer> box2 = new boxOfClassGeneric<>();
    Integer [] intarrys = {25, 10, 2} ;
    String [] strarrs = {"ge","ne","ric"} ;
    box1.setValue("hhdas"); //class Generic
    box2.setValue(99);
        System.out.println(box1.getValue());
        System.out.println(box2.getValue());
        boxOfMethodGeneric.printArrys(intarrys);
        boxOfMethodGeneric.printArrys(strarrs);


    }
}
