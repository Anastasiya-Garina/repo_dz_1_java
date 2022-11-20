import java.util.Scanner;

public class dz_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius (number): ");
        int r = sc.nextInt();
        int tochka = 0;

        System.out.print("Enter amount of points (number): ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(" ");
            System.out.print("Enter x coordinates (number): ");
            float x = sc.nextFloat();
            System.out.print("Enter y coordinates (number): ");
            float y = sc.nextFloat();
            if (x*x + y*y <= r*r){
                tochka += 1;
            }else {
                tochka += 0;
            }
        }
        System.out.println(" ");
        System.out.println(tochka + " points hit the circle");
    }
}