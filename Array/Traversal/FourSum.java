import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum
{
     public static List<List<Integer>> fourSum(int []nums, int target) {

        // Write your code here.
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
         int right = n-1;
        for(int i =0;i<n-3;i++)
        {   
            if(i>0 && nums[i] == nums[i-1]) continue;

            int left = i;
            int next = left+1;
 
            int prev = right-1;
            List<Integer> temp = new ArrayList<>();
            int sum = nums[left] + nums[next] + nums[right] + nums[prev];
            while(next<prev){
                if(sum==target)
            {
                temp.add(nums[left]);
                temp.add(nums[next]);
                temp.add(nums[prev]);
                temp.add(nums[right]);
                list.add(temp);

                next++;
                prev--;
                while(next<prev && nums[next] == nums[next-1]) next++;
                while(next<prev && nums[prev] == nums[prev+1]) prev--;
            }
            else if(sum<target)
            {
                next++;
            }
            else{
                boolean flag = false;
                while(nums[left]+ nums[next]+nums[prev]+nums[right] == target && next<prev)
                {
                    prev--;
                    if(nums[left]+ nums[next]+nums[prev]+nums[right] == target)
                    {
                        flag = true;
                    }
                }

                if(!flag)
                {
                    right--;
                    prev = right-1;
                }
            }

            }
         
        }

        return list;
    }

    public static List<List<Integer>> fourSum2(int []nums, int target) {

        // Write your code here.
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =0;i<n-3;i++)
        {   
            if(i>0 && nums[i] == nums[i-1]) continue;

            for(int j = i+1;j<n-2;j++)
            {
                if(j>i+1 && nums[j] == nums[j-1]) continue;

                int left = j;
                int right = n-1;
                List<Integer> temp = new ArrayList<>();
                int sum = nums[i] + nums[j] + nums[left] + nums[right];
                while(left<right){
                    if(sum==target)
                {
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    list.add(temp);

                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]) left++;
                    while(left<right && nums[right] == nums[right+1]) right--;
                }
                else if(sum<target)
                {
                    left++;
                }
                else{
                    boolean flag = false;
                    while(nums[i]+ nums[j]+nums[left]+nums[right] == target && left<right)
                    {
                        right--;
                        if(nums[i]+ nums[j]+nums[left]+nums[right] == target)
                        {
                            flag = true;
                        }
                    }

                    if(!flag)
                    {
                        left++;
                        right = n-1;
                    }
                }

                }
            }
        }

        return list;
    }
    public static void main(String[] args) {
        int []nums = {2,2,2,2,1,3};
        int target = 8;
        System.out.println(fourSum2(nums, target));
    }
}