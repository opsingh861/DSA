public class CapacityOfShip {
    public static int daysRequired(int weights[],int capacity){
        int day =1;
             int limit = capacity;
             int index=0;
             int  n = weights.length;
     
             while(index<n)
             {
                 if(weights[index]>capacity)
                 {
                     break;
                 }
                 if(weights[index]<=limit)
                 {
                     limit-=weights[index];
                     index++;
                 }
                 else
                 {
                     day++;
                     limit = capacity;
                 }
             }
             return day;
         }
         public static int leastWeightCapacity(int[] weights, int days) {
             // Write your code here.
               int n = weights.length;
                 int sum =0;
                 int min = Integer.MIN_VALUE;
                 for(int i=0;i<n;i++)
                 {
                     sum+= weights[i];
                     min = Math.max(min,weights[i]);
                 }
                 
                 int low = min;
                 int high = sum;
                 int mid = (low+high)/2;
     
                 while(low<=high)
                 {
                     int daysTook = daysRequired(weights,mid);
                     if(daysTook<=days)
                     {
                         high = mid-1;
                     }
                     else
                     {
                         low = mid+1;
                     }
     
                     mid = (low+high)/2;
                 }
                 return low;
         }

         public static void main(String[] args) {
                int n = 8;
                int weights[] = {1,2,3,4,5,6,7,8,9,10};
                int days = 5;
                System.out.println(leastWeightCapacity(weights, days));
         }
}
