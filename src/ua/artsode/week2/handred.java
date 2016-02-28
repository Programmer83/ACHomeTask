package ua.artsode.week2;

/**
 * Created by Dima Tolm on 27/02/2016.
 */
public class handred {
    public static void main(String[] args) {
        int num = 100;
        while (num > 0){
            System.out.print(num + ",");
            num -= 2;
        }
        int num2 = num + 1;
        while (num2 < 100) {
            System.out.print(num2 + ",");
            num2 += 2;
        }
    }
}
