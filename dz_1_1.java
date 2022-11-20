import java.util.Scanner;

public class dz_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date of birth (number): ");
        int day = sc.nextInt();
        System.out.print("Enter month of birth (number): ");
        int month = sc.nextInt();
        System.out.print("Enter year of birth (number): ");
        int year = sc.nextInt();
            System.out.println(" ");
        System.out.print("Enter date (number): ");
        int now_day = sc.nextInt();
        System.out.print("Enter month (number): ");
        int now_month = sc.nextInt();
        System.out.print("Enter year (number): ");
        int now_year = sc.nextInt();

        System.out.println(" ");
        System.out.println((now_year-year) +" years, "+ (now_month-month) +" months and "+ (now_day-day) + " days");
    }
}
