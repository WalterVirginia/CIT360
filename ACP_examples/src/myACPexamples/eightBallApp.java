package myACPexamples;

import java.util.Scanner;

public class eightBallApp {

    public static void main(String[] args){

        /**
         * Creates a new instance of the application controller.
         */
        eightBallAppController toHandle = new eightBallAppController();

        /**
         * This scanner takes input from user to give them the answer to their question
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Get Answers to your questions here!");

        /**
         * This part takes the number they enter
         */
        System.out.printf("Enter one, two, three, four, or five.");


        String userChoice = input.nextLine();
        toHandle.eightBallHandlerRequest(userChoice);


    }
}
