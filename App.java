public class App {

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

    public static void main( String[] args ) {
        
    }

}