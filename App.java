public class App {

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

}