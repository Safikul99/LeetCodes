class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m=nums1.length;
        int n=nums2.length;
        int []a=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                a[k]=nums1[i];
                k++;
                i++;
            }
            else
            {
                a[k]=nums2[j];
                k++;
                j++;

            }
        }
        while(i<m)
        {
            a[k]=nums1[i];
            i++;
            k++;

        }
         while(j<n)
        {
            a[k]=nums2[j];
            j++;
            k++;

        }
        if((n+m)%2!=0)
        {
            return a[(m+n)/2];
        }
        else
        {
            int x=(n+m)/2;
            double p=a[x];
            double q=a[x-1];
            return (p+q)/2;
        }
        
    }
}