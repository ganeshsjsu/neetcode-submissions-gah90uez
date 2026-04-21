class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int leftmax = 0;
        int rightmax = 0;
        int total = 0;

        while(left < right) {
            
            if(height[left] < height[right]) {
                int leftval = leftmax - height[left];
                leftmax = Math.max(leftmax, height[left]);
                if( leftval > 0) {

                total += leftval;
                
                
                }
                left++;
                
            } 
            else {
                int rightval = rightmax - height[right];
                rightmax = Math.max(rightmax, height[right]);
                if(rightval > 0) {
                total += rightval;
                
                
                }
                right--;
                
            }  
        }

        return total;
    }
}
