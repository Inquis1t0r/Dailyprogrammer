/*
Created by: Inquis1t0r
*/

import java.util.Scanner;

public class easy_1
{



    public static void main( String[] args )
            {
                String name;
                String age;
                String redditUsername;

            Scanner myScanner = new Scanner(System.in);

            System.out.println("What is your name?");
            name = myScanner.nextLine();

            System.out.println("How old are you?");
            age = myScanner.nextInt().toString();

            System.out.println("What is your reddit username?");
            redditUsername = myScanner.nextLine();

            System.out.println("your name is" + name +", you are" + age + "years old, and your username is" + redditUsername);
            }
}
