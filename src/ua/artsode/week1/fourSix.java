package ua.artsode.week1;
import java.util.Scanner;
/**
 * Created by Dima Tolm on 27/02/2016.
 */
public class fourSix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert two numbers: ");

        byte num1 = sc.nextByte();
        byte num2 = sc.nextByte();

        int sum = num1 + num2;

        if (sum > 11 && sum < 19) {
            System.out.println("Sum is : " + sum);

        }
    }

}
