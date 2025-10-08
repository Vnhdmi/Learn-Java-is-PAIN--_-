    package hCollections;

    import java.util.ArrayList;
    import java.util.Collection;

    public class demoCollection {
        public static void main(String[] args) {
            // interface
            //tao thong qua Collection

            Collection<Integer> myCollection = new ArrayList<>() ;
            myCollection.add(1);
            myCollection.add(2);
            myCollection.add(3);
            myCollection.add(4);
            myCollection.add(4);
            System.out.println(myCollection);
            myCollection.stream().filter(n-> n%2 == 0).forEach(System.out::println);
        }
    }

    //uu diem co the nhan nhieu kieu nh ArrayList List
    //doi lai ko dung cau lenh dc ua tung cai

