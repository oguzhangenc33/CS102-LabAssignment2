public class App {
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

    public static void main( String[] args ) {
    
    }

}