public class QuickSort {
    static int partition(int input[],int low,int high)
	{
		int pivot = input[low];
		int i = low;
		int j = high;
		while(i<j)
		{
            while(input[i]<=pivot && i<high)
            {
                i++;
            }
            while(input[j]>pivot && j>low)
            {
                j--;
            }
            if(i<j)
            {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
		
		}
		int temp = input[low];
		input[low] = input[j];
		input[j] = temp;

		return j;
	}
	
	public static void quickSort(int[] input,int startIndex, int endIndex) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		 if(startIndex<endIndex)
		 {
			 int pIndex = partition(input,startIndex,endIndex);
			 quickSort(input,startIndex,pIndex-1);
			 quickSort(input,pIndex+1,endIndex);
		 }
		
	}

    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 5, 4, 3 };
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
