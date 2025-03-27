package tekla_gogua_1.quiz1.t2.bowl.sub;
import tekla_gogua_1.quiz1.t2.bowl.A21;
import tekla_gogua_1.quiz1.t2.bread.bass.A22;

public class R21 {
  public static void main(String[] args) {
    A21 rectangle = new A21();
    A22 monthInfo = new A22();

    int area = rectangle.getWidth() * rectangle.getHeight();
    System.out.println("Area of the rectangle: " + area);

    int monthNumber = monthInfo.getMonth();
    String monthName = getMonthName(monthNumber);
    System.out.println("Month: " + monthName);
  }

  private static String getMonthName(int monthNumber) {
    return switch (monthNumber) {
        case 1 -> "January";
        case 2 -> "February";
        case 3 -> "March";
        case 4 -> "April";
        case 5 -> "May";
        case 6 -> "June";
        case 7 -> "July";
        case 8 -> "August";
        case 9 -> "September";
        case 10 -> "October";
        case 11 -> "November";
        case 12 -> "December";
        default -> "Invalid month (must be 1-12)";
    };
  }
}
