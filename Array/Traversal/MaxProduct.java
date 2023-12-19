public class MaxProduct {

  public int maxProductDifference(int[] arr) {
    int greatest = Integer.MIN_VALUE;
    int secondGreatest = Integer.MIN_VALUE;
    int n = arr.length;
    int lowest = Integer.MAX_VALUE;
    int secondLowest = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      if (arr[i] > greatest) {
        secondGreatest = greatest;
        greatest = arr[i];
      } else if (arr[i] > secondGreatest && arr[i] < greatest) {
        secondGreatest = arr[i];
      }

      if (arr[i] < lowest) {
        secondLowest = lowest;
        lowest = arr[i];
      } else if (arr[i] < secondLowest && arr[i] > lowest) {
        secondLowest = arr[i];
      }
    }
    int max = (greatest * secondGreatest) - (lowest * secondLowest);
    return max;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 6, 2, 7, 4 };
    MaxProduct mp = new MaxProduct();
    System.out.println(mp.maxProductDifference(arr));
  }
}
