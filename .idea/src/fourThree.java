import java.util.Scanner;
/**
 * Created by Dima Tolm on 25/02/2016.
 */
public class fourThree{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input number: ");
        int num = sc.nextInt();

        if (num % 7 == 0) {
            int res = num * 2;
            System.out.println(res);
        } else {
            System.out.println("Wrong number");
        }
    }
}
