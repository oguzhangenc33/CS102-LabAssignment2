import java.util.Arrays;

public class App {
    
    public static int[] setArray (int size){
        int[] intArray = new int[size];

        for(int k = 0; k < intArray.length; k++){
            intArray[k] = (int) (101 * Math.random());
        }

        return intArray;
    }
}

    