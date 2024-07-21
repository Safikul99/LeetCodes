class Solution {

    void  help(int [][]image,int oldColor ,int color,int i,int j)
    {
        if(i<0 ||i==image.length || j<0 || j==image[0].length || image[i][j]!=oldColor)
        return ;
        image[i][j]=color;
        help(image,oldColor,color,i,j-1);
       help(image,oldColor,color,i-1,j);
        help(image,oldColor,color,i,j+1);
         help(image,oldColor,color,i+1,j);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        int oldColor=image[sr][sc];
        if(oldColor==color)
        return image;
        help(image,oldColor,color,sr,sc);
        return image;
        
    }
}