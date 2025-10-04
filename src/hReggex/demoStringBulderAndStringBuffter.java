public class demoStringBulderAndStringBuffter {
    public static void main(String[] args) {
        // ================================
        // 1. Khởi tạo StringBuilder
        // ================================
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Chuỗi ban đầu (StringBuilder): " + sb);

        // append(): nối thêm chuỗi vào cuối
        sb.append(" World");
        System.out.println("Sau append: " + sb);

        // insert(): chèn chuỗi tại vị trí chỉ định
        sb.insert(5, " Java");
        System.out.println("Sau insert: " + sb);

        // replace(): thay thế chuỗi con từ start đến end
        sb.replace(6, 10, "JS");
        System.out.println("Sau replace: " + sb);

        // delete(): xóa chuỗi con từ start đến end
        sb.delete(5, 8);
        System.out.println("Sau delete: " + sb);

        // reverse(): đảo ngược chuỗi
        sb.reverse();
        System.out.println("Sau reverse: " + sb);

        // capacity(): dung lượng hiện tại
        System.out.println("Dung lượng hiện tại của StringBuilder: " + sb.capacity());

        // ensureCapacity(): đảm bảo dung lượng tối thiểu
        sb.ensureCapacity(50);
        System.out.println("Dung lượng sau ensureCapacity(50): " + sb.capacity());

        // ================================
        // 2. StringBuffer (giống hệt StringBuilder nhưng thread-safe)
        // ================================
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" Buffer");
        System.out.println("\nChuỗi ban đầu (StringBuffer): " + sbf);

        // Các phương thức giống với StringBuilder
        sbf.insert(5, " Java");
        System.out.println("StringBuffer sau insert: " + sbf);

        sbf.replace(6, 10, "C#");
        System.out.println("StringBuffer sau replace: " + sbf);

        sbf.reverse();
        System.out.println("StringBuffer sau reverse: " + sbf);

        // ================================
        // 3. So sánh hiệu suất String, StringBuilder, StringBuffer
        // ================================
        long startTime, endTime;

        // String (immutable, chậm hơn khi thay đổi nhiều lần)
        startTime = System.nanoTime();
        String str = "A";
        for (int i = 0; i < 10000; i++) {
            str += "A"; // mỗi lần lặp tạo 1 đối tượng mới
        }
        endTime = System.nanoTime();
        System.out.println("\nThời gian với String: " + (endTime - startTime) + " ns");

        // StringBuilder (nhanh hơn, không thread-safe)
        startTime = System.nanoTime();
        StringBuilder sbTest = new StringBuilder("A");
        for (int i = 0; i < 10000; i++) {
            sbTest.append("A");
        }
        endTime = System.nanoTime();
        System.out.println("Thời gian với StringBuilder: " + (endTime - startTime) + " ns");

        // StringBuffer (thread-safe nhưng chậm hơn StringBuilder)
        startTime = System.nanoTime();
        StringBuffer sbfTest = new StringBuffer("A");
        for (int i = 0; i < 10000; i++) {
            sbfTest.append("A");
        }
        endTime = System.nanoTime();
        System.out.println("Thời gian với StringBuffer: " + (endTime - startTime) + " ns");

        // ================================
        // 4. Kết luận (in ra như docs)
        // ================================
        System.out.println("\n=== Tổng kết ===");
        System.out.println("String: bất biến (immutable), mỗi thay đổi tạo đối tượng mới -> tốn bộ nhớ, chậm.");
        System.out.println("StringBuilder: mutable, nhanh, dùng trong ứng dụng đơn luồng.");
        System.out.println("StringBuffer: mutable, thread-safe (đồng bộ hóa), chậm hơn StringBuilder.");
    }
}
