/**
 * Created by simonhamermesh on 1/28/16.
 */

import java.util.Scanner;

public class WaxManager {

    public static Scanner scanner = new Scanner(System.in);

    public static Wax pickWax(String x , int y){

        return Wax.chooseWax(x,y);
    }

    public static void main(String[] args) {



        System.out.println("Enter the Temperature:  ");
        int tempInput = scanner.nextInt();


        scanner.nextLine();
        System.out.println("Enter the Snow Condition:  ");
        String snowInput = scanner.nextLine();


        Wax wax1 = pickWax(snowInput, tempInput);
        System.out.println("Wax Color is: "+wax1.getColor());
        System.out.println("Wax Type is:  "+wax1.getType());
    }

}