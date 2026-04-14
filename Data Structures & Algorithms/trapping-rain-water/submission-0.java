class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftpass = new int[n];
        int leftmax = 0;
        int[] rightpass = new int[n];
        int rightmax = 0;
        int trapped = 0;
        for(int i=0; i<n; i++) {
            leftmax = Math.max(leftmax, height[i]);
            leftpass[i] = leftmax;
        }
        for(int i=n-1; i>0; i--) {
            rightmax = Math.max(rightmax, height[i]);
            rightpass[i] = rightmax;
        }

        System.out.println(Arrays.toString(leftpass));
        System.out.println(Arrays.toString(rightpass));

        for(int i=0; i<n; i++) {
            int minside = Math.min(leftpass[i], rightpass[i]);
            int area = minside - height[i];
            if(area > 0) {
                trapped += area;
            }
        }

        return trapped;
    }
}
