package ua.artsode.week1;
import java.util.Scanner;
/**
 * Created by Dima Tolm on 27/02/2016.
 */
public class fourEight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please insert two numbers : ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if ((num1 % 10) == (num2 % 10 )) {

            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
