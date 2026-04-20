class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length - 1;
        int left = 0;
        int right = n;
        int max = 0;

        while(left < right) {
            int wid = right - left;
            int water = Math.min(heights[left], heights[right]) * wid;
            max = Math.max(max, water);

            if(heights[left] > heights[right]) {
                right--;
            }
            else {
                left++;
            }
        }

        return max;
    }
}
