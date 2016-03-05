package ua.artsode.week2;

/**
 * Created by Programmer on 04/03/2016.
 */
public class RandNum {
    public static void main(String[] args) {
        double res = Math.pow(2,5);

        double random = Math.random();

        System.out.println(random);

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            double random1 = Math.random();
            int ran = (int)(random1 * 15);
            System.out.println(Math.random());
            System.out.println(ran);
        }
    }
}
