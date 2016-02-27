package ua.artsode.week1;
import java.util.Scanner;
/**
 * Created by Dima Tolm on 26/02/2016.
 */
public class fiveTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert Factorial length: ");

        int lenght = sc.nextInt();
        int fl = 1;

        for (int i = 1; i <= lenght; i++ ) {
            fl *= i;
        }

        System.out.println("Factorial of: " + lenght + " is " + fl);
    }
}
