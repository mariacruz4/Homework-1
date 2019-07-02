import java.util.*;

public class MonthConverterIf {

    public static void main(String[] args){

        //prompt the user to input number
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1-12: ");

        int num = scanner.nextInt();

        //if loop that detects which month to print
        if(num == 1){
            System.out.println("January");
        }
        if(num == 2){
            System.out.println("February");
        }
        if(num == 3){
            System.out.println("March");
        }
        if(num == 4){
            System.out.println("April");
        }
        if(num == 5){
            System.out.println("May");
        }
        if(num == 6){
            System.out.println("June");
        }
        if(num == 7){
            System.out.println("July");
        }
        if(num == 8){
            System.out.println("August");
        }
        if(num == 9){
            System.out.println("September");
        }
        if(num == 10){
            System.out.println("October");
        }
        if(num == 11){
            System.out.println("November");
        }
        if(num == 12){
            System.out.println("December");
        }
        else if(num < 1 || num > 12){
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }
    }
}
