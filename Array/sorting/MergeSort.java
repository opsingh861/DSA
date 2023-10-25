import java.util.ArrayList;

public class MergeSort {
    static void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    static void merge(int arr[], int low, int mid, int high) {

        // int n1 = mid - low+1;
        // int n2 = high - mid;

        // int left[] = new int[n1];
        // int right[] = new int[n2];

        // for (int i = 0; i < n1; i++)
        //     left[i] = arr[low + i];
        // for (int j = 0; j < n2; j++)
        //     right[j] = arr[mid + 1 + j];

        // int i = 0, j = 0, k = low;

        // while (i < n1 && j < n2) {
        //     if (left[i] <= right[j]) {
        //         arr[k++] = left[i++];
        //     } else {
        //         arr[k++] = right[j++];
        //     }
        // }

        // while (i < n1) {
        //     arr[k++] = left[i++];
        // }

        // while (j < n2) {
        //     arr[k++] = right[j++];
        // }
            
        ArrayList<Integer> list = new ArrayList<>();
        int i = low, j = mid + 1;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                list.add(arr[i++]);
            } else {
                list.add(arr[j++]);
            }
        }

        while (i <= mid) {
            list.add(arr[i++]);
        }

        while (j <= high) {
            list.add(arr[j++]);
        }

        // for (int k = low; k <= high; k++) {
        //     arr[k] = list.get(k - low);
        // }

        int k = 0;
        for (i = low; i <= high; i++) {
            arr[i] = list.get(k++);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
