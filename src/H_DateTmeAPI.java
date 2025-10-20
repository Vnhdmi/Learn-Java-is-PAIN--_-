import java.time.LocalDateTime;
import java.time.LocalTime; // Không dùng trong main, nhưng vẫn giữ lại
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class H_DateTmeAPI {

    // Khai báo Locale Việt Nam để tái sử dụng, dùng mã chuẩn "vi"
    private static final Locale VIETNAMESE_LOCALE = Locale.of("vi", "VN");
    // Khai báo Locale Trung Quốc (ví dụ)
    private static final Locale CHINESE_LOCALE = new Locale("zh", "CN"); // Mã ngôn ngữ "zh" (Trung)

    public static void main(String[] args) {
        // 1. Định nghĩa các DateTimeFormatter cần dùng
        // Formatter 1: Ngày tháng năm đầy đủ với Locale Việt Nam
        DateTimeFormatter dtfFull = DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm")
                .withLocale(VIETNAMESE_LOCALE);

        // Formatter 2: Tên tháng và ngày (Locale sẽ được ghi đè sau)
        DateTimeFormatter dtfMonthDay = DateTimeFormatter
                .ofPattern("MMMM, dd"); // MMMM là Tên tháng đầy đủ

        // Formatter 3: Giờ 24h
        DateTimeFormatter dtfHour24 = DateTimeFormatter.ofPattern("HH:mm");

        // Formatter 4: Giờ 12h có AM/PM
        // Lưu ý: Kết quả AM/PM sẽ phụ thuộc vào Locale được sử dụng khi format.
        DateTimeFormatter dtfHour12 = DateTimeFormatter.ofPattern("hh:mm a");

        // 2. Lấy đối tượng Ngày Giờ Cục Bộ (LocalDateTime)
        // Lấy thời gian hiện tại chính xác của múi giờ Hồ Chí Minh (UTC+7)
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));

        System.out.println("--- Dữ liệu gốc (LocalDateTime) ---");
        System.out.println("Thời gian tại HCM: " + now);

        System.out.println("\n--- Định dạng theo Locale và Pattern ---");

        // 3. In ra sử dụng dtfHour24 (Giờ 24h)
        // Không chỉ định Locale, kết quả chỉ là số.
        System.out.println("Giờ 24h (HH:mm): " + now.format(dtfHour24));

        // 4. In ra sử dụng dtfHour12 (Giờ 12h)
        // Mặc định, nó dùng Locale hệ thống. Nếu Locale hệ thống là vi_VN, 'a' sẽ là CH/SA.
        // Để đảm bảo tiếng Việt: now.format(dtfHour12.withLocale(VIETNAMESE_LOCALE))
        System.out.println("Giờ 12h (hh:mm a) [Mặc định]: " + now.format(dtfHour12));

        // 5. In ra sử dụng dtfFull (Có Locale VN được gán sẵn)
        System.out.println("Ngày giờ đầy đủ (dd/MM/yyyy HH:mm) [Locale VN]: " + now.format(dtfFull));

        // 6. In ra sử dụng dtfMonthDay (Tháng, Ngày)
        // Ghi đè Locale của Formatter này thành Tiếng Trung ("zh", "CN") ngay lúc format.
        System.out.println("Tên tháng (MMMM, dd) [Locale CN]: " +
                now.format(dtfMonthDay.withLocale(CHINESE_LOCALE))
        ); // Kết quả sẽ có ký tự Hán tự cho tên tháng (ví dụ: 十月, 20)
    }
}