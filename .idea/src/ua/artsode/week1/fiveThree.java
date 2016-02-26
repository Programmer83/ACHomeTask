package ua.artsode.week1;

import java.util.Scanner;
/**
 * Created by Dima Tolm on 25/02/2016.
 */
public class fiveThree {

    public static void main(String[] args) {

        int[] myNum = {5,8,3,8};

        int res = 0;

        for (int i = 0 ; i < myNum.length; i++){
            if (myNum[i] == 8) {
                res++;
            }
        }

        System.out.println("res = " + res);
    }
}
