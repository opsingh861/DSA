import java.util.*;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 1, 2, 3 };
        int arr2[] = { 1, 1, 2, 4 };
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
}
