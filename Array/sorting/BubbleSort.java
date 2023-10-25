public class BubbleSort {
    static void bubbleSort(int arr[], int n) {
        boolean flag = false;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
        int n = arr.length;
        bubbleSort(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}