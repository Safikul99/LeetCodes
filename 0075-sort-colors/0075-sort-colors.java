class Solution {
    public void sortColors(int[] nums)
     {
        int me=0, n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                int temp=nums[i];
                nums[i]=nums[me];
                nums[me]=temp;
                me++;
            }
        }
        me=n-1;
        for(int j=n-1;j>=0;j--)
        {
            if(nums[j]==2)
            {
                int temp=nums[j];
                nums[j]=nums[me];
                nums[me]=temp;
                me--;
            }
        }
        
    }
}