public class propertyOfString {
    public static void main(String[] args) {
        String hdmi = "Hello" ;
        String hdmi1 = "Hello" ;
        String hdmi2 = new String("Hello" ) ;
        System.out.printf("hdmi = %s - hashmap %s" , hdmi,System.identityHashCode(hdmi)); //cung 1 dia chi voi hdmi1
        System.out.printf("hdmi = %s - hashmap %s" , hdmi1,System.identityHashCode(hdmi1));
        System.out.printf("hdmi = %s - hashmap %s" , hdmi2,System.identityHashCode(hdmi2)); // se tao vung nho ring


    }
}
