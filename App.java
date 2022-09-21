import java.util.Arrays;
import java.util.Scanner;

public class App {
    
    public static int[] setArray (int size){
        int[] intArray = new int[size];
        for(int k = 0; k < intArray.length; k++){
            intArray[k] = (int) (101 * Math.random());
        }
        return intArray;
    } 
    public static int[] diffFromAverage(int[] arr) {
        int total = 0;
        int average;
        int[] newArr = new int[arr.length];
        for (int n : arr) {
            total += n;
        }
        average = total / arr.length;

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i] - average;
        }

        return newArr;
    }
    public static int calculateSpecialSum (int[] arr, boolean isOdd){
        int lenght = arr.length;
        int sum = 0;
        if (!isOdd){
            for(int i = 0; i < lenght ; i = i +2){
                sum += arr[i];
            }
        }
        else{
            for(int i = 1; i < lenght ; i = i +2){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        int[] randArray = new int[0];

        do {
            System.out.printf("""

            Array: %s
            1 - Set random array
            2 - Get minimum value of array    
            3 - Get maxiumum value of array  
            4 - Differences from average
            5 - Calculate sum of even indexed values
            6 - Calculate sum of odd indexed values
            9 - Exit

            """, randArray.length != 0 ? Arrays.toString(randArray) : "Not generated yet.");
            System.out.print( "Selection: " );
            int selection = input.nextInt();
            if( selection == 1 ) {
                System.out.println("Enter size of the array which will be created");
                int size = input.nextInt();
                randArray = setArray( size );
                System.out.println("Your random generated array: " + Arrays.toString( randArray ) );
            } else if( selection == 9 ) {
                exit = true;
                System.out.println("Exiting...");
            } else if( randArray.length == 0 ) {
                System.out.println("First you need to generate array with selection '1' ");
            }else if( selection == 2 ) {
                int minValue = getMinimum( randArray );
                System.out.println("Minimum number of the array: " + minValue);
            } else if( selection == 3 ) {
                int maxValue = getMaximum( randArray );
                System.out.println("Maximum number of the array: " + maxValue);
            } else if( selection == 4 ) {
                int[] diffArray = diffFromAverage( randArray );
                System.out.println( "Differences from average: " + Arrays.toString( diffArray ) );
            } else if( selection == 5 ) {
                int sum = calculateSpecialSum( randArray, false );
                System.out.println("Sum of even indexed values: " + sum);
            }  else if( selection == 6 ) {
                int sum = calculateSpecialSum( randArray, true );
                System.out.println("Sum of odd indexed values: " + sum);
            } else {
                System.out.println("This is not a valid selection.");
            }

        } while (exit == false);

    }
    public static int getMinimum(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }



        return min;
    }


    public static int getMaximum(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }



        return max;
    }
}

