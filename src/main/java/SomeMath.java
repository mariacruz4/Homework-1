public class SomeMath {

    public static void main(String[] args) {
        //calling the methods
        System.out.println("The total is: " + total5(1, 2, 3, 4, 5));

        System.out.println("The average is: " + average5(1, 3, 5, 7, 9));

        System.out.println("The largest is: " + largest5(42.0, 35.1, 2.3, 40.2, 15.6));
    }
    //method for adding the parameters
    public static int total5(int a, int b, int c, int d, int e) {

        return (a + b + c + d + e);
    }
    //method finds the average of the parameters
    public static double average5(int a, int b, int c, int d, int e) {

        return ((a + b + c + d + e) / 5);
    }
    //finding the largest parameter
    public static double largest5(double a, double b, double c, double d, double e) {
        //create array
        double[] largest5 = {a, b, c, d, e};
        //declare a the largest
        double max = largest5[0];
        //for loop that checks each value to see which is larger
        for(int i = 1; i < largest5.length; i++){

            if (largest5[i] > max)

                max = largest5[i];

        }return max;
    }
}
