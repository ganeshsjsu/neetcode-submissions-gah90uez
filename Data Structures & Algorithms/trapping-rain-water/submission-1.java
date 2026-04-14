class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftmax = 0;
        int rightmax = 0;
        int trapped = 0;
        int left = 0;
        int right = n-1;
        

        while(left < right) {
            if(height[left] < height[right]) {
                if(height[left] >= leftmax) {
                    leftmax = height[left];
                }
                else {
                    trapped += leftmax - height[left];
                }
                left++;
            }
            else {
                if(height[right] >= rightmax) {
                    rightmax = height[right];
                }
                else {
                    trapped += rightmax - height[right];
                }
                right--;
            }
            
        }

        return trapped;
    }
}
