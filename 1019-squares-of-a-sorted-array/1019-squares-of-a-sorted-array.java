class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
             boolean b=false;
            for(int j=0;j<nums.length-1;j++)
            {
               
                if(nums[j]>nums[j+1])
                {
                    b=true;

                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;

                }
            }
            if(b==false)
            {
                break;
            }
        }
        return nums;
        
    }
}