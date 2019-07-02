import java.util.*;

public class ValidNumber {

    public static void main(String[] args){

        //Prompt the user to enter a number
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = scanner.nextInt();

        //while loop that decides whether the number inputted is in the range

        while(num < 1 || num > 10){

            System.out.println("You must enter a number between 1 and 10, please try again.");

            System.out.println("Enter number: ");

            num = scanner.nextInt();
        }

        System.out.println(num);





    }
}
