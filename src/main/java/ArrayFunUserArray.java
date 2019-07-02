import java.util.*;

public class ArrayFunUserArray {

    public static void main(String[] args) {
        //prompt the user for input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");
        //declare size of array
        int arr1[] = new int[5];

        //for loop that receives the input and stores the values in the array
        for(int i = 0;i < arr1.length;i++){

            arr1[i] = scanner.nextInt();

        }
        //print array
        for (int i = 0;i < arr1.length;i++) {

            System.out.println(arr1[i]);
        }
    }
}

