package ua.artsode.week1;
import java.util.Scanner;
/**
 * Created by Dima Tolm on 27/02/2016.
 */
public class fourFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert float number: ");
        double num = sc.nextDouble();

        if (num > 0 && num < 1) {
            System.out.println("inside");
        } else {
            System.out.println("not");
        }

    }
}
