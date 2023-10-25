public class SelectionSort {
    public static void selectionSort(int[] arr) {
        // Your code goes here
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // swap function
        int[] arr = { 5, 4, 3, 2, 1 };
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}