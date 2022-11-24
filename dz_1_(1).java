import java.util.Scanner;

public class dz_1 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("День рождения: ");
        int day = vvod.nextInt();
        System.out.print("Месяц рождения: ");
        int month = vvod.nextInt();
        System.out.print("Год рождения: ");
        int year = vvod.nextInt();

        System.out.print("Текущий день: ");
        int day_tek = vvod.nextInt();
        System.out.print("Текущий месяц: ");
        int month_tek = vvod.nextInt();
        System.out.print("Текущий год: ");
        int year_tek = vvod.nextInt();
        int perenos = 0;
        int month_razn = 0;
        int day_razn = 0;
        if (day_tek >= day) {
            day_razn = day_tek - day;
            perenos = 0;
        } else {
            int day_Month;
            if (month==2)
            {day_Month = 28;}
            else if (month == 4 || month == 6 || month == 9 || month == 11 ) {
                day_Month = 30;}
            else {
                day_Month = 31;}
            day_razn = day_tek + day_Month - day;
            perenos = 1;
        }
        if (month_tek >= month + perenos) {
            month_razn = month_tek - month - perenos;
            perenos = 0;
        } else {
            month_razn = month_tek + 12 - month;
            perenos = 1;
        }
        int year_razn = year_tek - year - perenos;
        System.out.print(year_razn + " лет, " + month_razn + " месяцев и " + day_razn + " дней");
    }
}