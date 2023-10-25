import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 4 };
        int arr2[] = { 1, 4, 4, 5 };
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println(count);
    }
}
