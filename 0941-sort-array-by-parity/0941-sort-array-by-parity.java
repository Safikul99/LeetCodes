class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {
        int n=nums.length;
        int me=n-1,frnd=0;
        int []res=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==1)
            {
                res[me--]=nums[i];
            }
            else
             res[frnd++]=nums[i];
        }
        return res;
        
    }
}