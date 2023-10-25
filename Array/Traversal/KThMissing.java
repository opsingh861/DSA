import java.util.*;

public class KThMissing {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 11 };
        int k = 5;
        int count = 1;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != count) {
                array.add(count);
            }
            count++;
        }
        System.out.println(array.get(k));
    }
}