import java.util.Arrays;

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

