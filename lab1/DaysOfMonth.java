import java.util.Scanner;

public class DaysOfMonth {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input Month:");
        String month = keyboard.nextLine();
        System.out.println("Input Year:");
        int year = keyboard.nextInt(); // Đọc năm dưới dạng số nguyên

        if (isValidYear(year) && parseMonth(month) != 0) {
            int days = getDaysInMonth(month, year);
            System.out.println("Number of days: " + days);
        } else {
            System.err.println("Invalid month or year input.");

        }
    }

    private static int parseMonth(String monthInput) {
        // Chuyển đổi tháng từ chuỗi thành số
        switch (monthInput.toLowerCase()) {
            case "january", "jan": return 1;
            case "february", "feb": return 2;
            case "march", "mar": return 3;
            case "april", "apr": return 4;
            case "may": return 5;
            case "june", "jun": return 6;
            case "july", "jul": return 7;
            case "august", "aug": return 8;
            case "september", "sep": return 9;
            case "october", "oct": return 10;
            case "november", "nov": return 11;
            case "december", "dec": return 12;
            default:
                // Nếu là số, cố gắng chuyển đổi
                try {
                    int monthh = Integer.parseInt(monthInput);
                    return (monthh >= 1 && monthh <= 12) ? monthh : 0; // Trả về 0 nếu không hợp lệ
                } catch (NumberFormatException e) {
                    return 0; // Trả về 0 nếu không phải số
                }
        }
    }

    private static boolean isValidYear(int year) {
        // Kiểm tra tính hợp lệ của năm
        return year >= 1000 && year <= 9999;
    }
    private static int getDaysInMonth(String month, int year) {
        int monthNumber = parseMonth(month); // Chuyển chuỗi tháng thành số
        switch (monthNumber) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0; // Không nên đến đây nếu kiểm tra hợp lệ đúng
        }
    }
    private static boolean isLeapYear(int year) {
        // Kiểm tra năm nhuận
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
