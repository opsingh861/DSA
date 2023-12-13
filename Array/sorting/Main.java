import java.util.*;

class MyThread extends Thread {
    void bubbleSortAsc(int arr[], int n, int ans[]) {
        boolean flag = false;
        int count = 0;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                    count++;
                }
            }
            if (flag == false)
                break;
        }
        ans[0] = count;

    }

    void bubbleSortDesc(int arr[], int n, int ans[]) {
        boolean flag = false;
        int count = 0;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                    count++;
                }
            }
            if (flag == false)
                break;
        }
        ans[1] = count;
    }
}

public class Main {
    public static void main(String args[]) {
        // // MyThread t1 = new MyThread();
        // // t1.start(); // Start the first thread

        // MyThread t2 = new MyThread();
        // t2.start(); // Start the second thread
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int dup[] = Arrays.copyOf(arr, arr.length);
        int ans[] = new int[2];
        MyThread t1 = new MyThread();
        t1.bubbleSortAsc(arr, n, ans);

        MyThread t2 = new MyThread();
        t2.bubbleSortDesc(dup, n, ans);
        if (ans[0] < ans[1]) {
            System.out.println(ans[0] );
        } else {
            System.out.println(ans[1] );
        }
    }
}
