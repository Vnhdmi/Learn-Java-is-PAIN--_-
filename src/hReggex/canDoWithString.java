public class canDoWithString {
    public static void main(String[] args) {
        // Tạo một chuỗi ban đầu
        String text = "   Hello Java World!   ";
        System.out.println("Chuỗi gốc: [" + text + "]");

        // 1. length(): độ dài chuỗi
        System.out.println("Độ dài chuỗi: " + text.length());

        // 2. charAt(int index): lấy ký tự tại vị trí index
        System.out.println("Ký tự tại vị trí 6: " + text.charAt(6));

        // 3. substring(start, end): lấy chuỗi con
        System.out.println("Chuỗi con từ 3 đến 7: " + text.substring(3, 7));

        // 4. toLowerCase(): đổi thành chữ thường
        System.out.println("Chữ thường: " + text.toLowerCase());

        // 5. toUpperCase(): đổi thành chữ hoa
        System.out.println("Chữ hoa: " + text.toUpperCase());

        // 6. trim(): xóa khoảng trắng đầu/cuối
        System.out.println("Sau khi trim: [" + text.trim() + "]");

        // 7. equals(Object obj): so sánh chuỗi
        String s1 = "Java";
        String s2 = "java";
        System.out.println("So sánh equals: " + s1.equals(s2)); // false
        System.out.println("So sánh equalsIgnoreCase: " + s1.equalsIgnoreCase(s2)); // true

        // 8. contains(CharSequence seq): kiểm tra có chứa không
        System.out.println("Chuỗi có chứa 'Java'? " + text.contains("Java"));

        // 9. replace(char oldChar, char newChar): thay ký tự
        System.out.println("Thay 'a' bằng 'x': " + text.replace('a', 'x'));

        // 10. indexOf(String str): tìm vị trí xuất hiện đầu tiên
        System.out.println("Vị trí 'Java': " + text.indexOf("Java"));

        // 11. lastIndexOf(String str): tìm vị trí cuối cùng
        System.out.println("Vị trí cuối cùng của 'o': " + text.lastIndexOf("o"));

        // 12. split(String regex): tách chuỗi
        String[] parts = text.trim().split(" "); // tách theo dấu cách
        System.out.println("Các từ trong chuỗi:");
        for (String part : parts) {
            System.out.println("- " + part);
        }
    }
}
