package ua.artsode.week2;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Programmer on 05/03/2016.
 */
public class RandomPass {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input pass size");
        int size = sc.nextInt();

        int[] mas = new int[size];

        System.out.println("input range");
        int range = sc.nextInt();

        for (int i = 0; i < mas.length; i++) {
             mas[i] = (int)(Math.random() * range);
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        System.out.println("are you pleased?");
        boolean isGoodPass = sc.nextBoolean();
        if (isGoodPass){
            System.out.println("****************");
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }
            System.out.println();5
            System.out.println("****************");



            System.out.println("End");
        } else {
            System.out.println("Repeat action");

        }

    }

}
