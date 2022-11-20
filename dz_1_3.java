import java.util.Scanner;

public class dz_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //принять число и степень
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter the degree of the number (-15, 15): ");
        int n = sc.nextInt();

        //обработка положительной стпени
        int res_x = 1;
        if ((0 < n) && (n < 16)){
            for (int i = 1; i <= n; i++){
                res_x *= x;
            }
            System.out.println(res_x);
        }

        //обработка отрицательной степени
        else if ((-16 < n) && (n < 0)){
            n = n * (-1);
            for (int i = 1; i <= n; i++){
                res_x *= x;
            }
            System.out.println("1/" + res_x);
        }

        //обработка нулевой степени
        else if (n == 0)
            System.out.println("1");

        //ошибка степени
        else System.out.println("Error_degreeOfTheNumber");
    }
}