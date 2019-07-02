import java.util.Arrays;

public class ArrayFunReverseIt {

    public static void main(String[] args){
        //declare arr1
        int[] arr1 = {1,2,3,4,5};
        //declare size of new array
        int[] arr2 = new int[arr1.length];
        //for loop that reverses the values from arr1 and adds them to arr2
        for(int i = 0;i < arr2.length;i++){

            arr2[i] = arr1[arr1.length - 1 - i];

        }
        //printing the arrays
        System.out.println("Array 1: ");

        System.out.println(Arrays.toString(arr1));

        System.out.println("Array 2: ");

        System.out.println(Arrays.toString(arr2));
    }
}
