class Solution {
    public void sortColors(int[] nums)
     {
        int count0=0,count1=0,count2=0, n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            count0++;
            else if(nums[i]==1)
            count1++;
            else
            count2++;
        }
        int x=0;
        while(count0!=0)
        {
            nums[x]=0;
            count0--;
            x++;
        }
         while(count1!=0)
        {
            nums[x]=1;
            count1--;
            x++;
        }
         while(count2!=0)
        {
            nums[x]=2;
            count2--;
            x++;
        }
        
          
        
    }
}