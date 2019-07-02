import java.util.*;

public class ArrayFun5Words {

    public static void main(String[] args){

        //prompt the user for input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");
        //declare size of array
        String arr[] = new String[5];

        //for loop that receives the input and stores the values in the array
        for(int i = 0;i < arr.length;i++){

            arr[i] = scanner.nextLine();

        }
        //print the array
        for (int i = 0;i < arr.length;i++) {

            System.out.println(arr[i]);
        }
    }
}

