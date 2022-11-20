import java.util.Scanner;

public class dz_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day, month;

        System.out.print("Enter day (number): ");
        day = sc.nextInt();
        System.out.print("Enter month (number): ");
        month = sc.nextInt();

        //проверка месяцев, где 31 день
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if (0 < day && day < 32)
                if (month == 1 || month == 12)
                    System.out.println("Winter");
                else if (month == 3 || month == 5)
                    System.out.println("Spring");
                else if (month == 7 || month == 8)
                    System.out.println("Summer");
                else System.out.println("Autumn");
            else System.out.println("Error_day");
        }

        //проверка месяцев, где 30 дней
        else if (month == 4 || month == 6 || month == 9 || month == 11){
            if (0 < day && day < 31)
                if (month == 4)
                    System.out.println("Spring");
                else if (month == 6)
                    System.out.println("Summer");
                else System.out.println("Autumn");
            else System.out.println("Error_day");
        }

        //проверка месяцев, где 28 дней
        else if (month == 2) {
            if (0 < day && day < 29)
                System.out.println("Winter");
            else System.out.println("Error_day");
        }else System.out.println("Error_month");
        }
}