package ua.artsode.week2;

import java.util.Scanner;

/**
 * Created by Programmer on 05/03/2016.
 */
public class NeedMethod {
    public static void main(String[] args) {

        inputNameAndSayHello();

    }
    public static void inputNameAndSayHello(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name");
        String name = sc.next();
        String message = "hello " +name;
        System.out.println(message);
    }
}
