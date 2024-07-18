class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int n=nums.length;
        int i=0;
        for(i=0;i<n;i++)
        {
            if(nums[i]>=0)
            {
                break;
            }
        }
        for(int j=0;j<n;j++)
        {
            nums[j]=nums[j]*nums[j];
        }
        int j=i-1,k=0;
        int []res=new int[n];
        while(j>=0&& i<n)
        {
            if(nums[i]<nums[j])
            {
                res[k++]=nums[i++];
            }
            else
            res[k++]=nums[j--];
        }
        while(i<n)
        {
            res[k++]=nums[i++];
        }
        while(j>=0)
        {
            res[k++]=nums[j--];
        }
        return res;
    }
       
        }
