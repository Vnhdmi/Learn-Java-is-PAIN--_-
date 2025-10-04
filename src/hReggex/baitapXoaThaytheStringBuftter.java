public class baitapXoaThaytheStringBuftter {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello, Java World!");
        System.out.printf(" Chuoi ban dau :%s \n ", str);
        str.delete(6,11);
        System.out.printf(" Chuoi ban sau khi xoa : %s \n", str);
        int index = str.indexOf("World");
        if (index == -1) {
            str.replace(index,str.length()-1,"Universe");
        }

        System.out.printf("Chuoi sau khi thay the %s : ",str );


    }


}
