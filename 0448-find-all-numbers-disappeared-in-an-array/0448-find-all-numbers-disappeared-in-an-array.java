class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {

        List l1=new ArrayList();
        int []a=new int[nums.length+1];

    for(int i:nums)
    {
       a[i]++;
    }
    for(int i=1;i<a.length;i++)
    {
        if(a[i]==0)
        {
            l1.add(i);
        }
    }
        return l1;
        
        
    }
}