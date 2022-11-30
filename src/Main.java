import java.util.Random;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

        String HW = "Goodbye world!";

        System.out.println("Hello world!");
        System.out.print("Hello world!".charAt(1) + " ");
        System.out.println("Hello world!".substring(1,2));
        System.out.print(HW.charAt(1) + " ");
        System.out.println(HW.substring(13,14));
        for (int i = HW.length(); i>0; i--){
            System.out.print(HW.charAt(i-1));
        }
        System.out.println();
        for (int i = "Hello world!".length(); i>0; i--){
            System.out.print("Hello world!".substring(i-1,i));
        }
        System.out.println();
        char[] massHW = "Hello world!".toCharArray();
        for (int c = massHW.length; c>0; c--){
            System.out.print(massHW[c-1]);
        }
        System.out.println();
        for (char j : massHW){
            System.out.print(j + " ");
        }
        char[] arr = {'d','g','2'};
        System.out.println(arr);

        Random rand = new Random();
        int r = 0;
        while (r != 5){
            r = rand.nextInt(6);
            System.out.print(r);

        }
    }
}