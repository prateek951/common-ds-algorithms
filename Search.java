import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int []intArray = {20,35,-15,7,55,1,-22};
        int index = linearSearch(intArray,35);
        System.out.println("Element found at the index " + index);
    }
    public static int linearSearch(int arr[],int elem) {
        boolean found = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == elem) {
                found = true;
                index = i;
                break;
            }
        }
        return index;
    }

}
