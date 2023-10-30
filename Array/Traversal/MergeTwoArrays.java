import java.util.ArrayList;
import java.util.List;

public class MergeTwoArrays {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
               List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
 while (i < a.length && j < b.length) {
        if(a[i]<=b[j])
        {
            if(list.size()==0 || list.get(list.size()-1)!=a[i])
            {
                list.add(a[i]);
            }
            i++;
        }
        else{

        
            if(list.size()==0 || list.get(list.size()-1)!=b[j])
            {
                list.add(b[j]);
            }
            j++;
        }
    }

        while (i < a.length) {
        if(list.get(list.size()-1)!=a[i])     list.add(a[i]);
            i++;
        }
        while (j < b.length) {
         if(list.get(list.size()-1)!=b[j])     list.add(b[j]);
            j++;
        }

        return list;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 2, 3, 4, 5 };
        System.out.println(sortedArray(a, b));
    }
}