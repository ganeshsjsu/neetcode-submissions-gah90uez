class Solution {
    public boolean isPalindrome(String s) {
       int left = 0;
       int right = s.length() - 1;
       String lower = s.toLowerCase();

       while(left < right) {
            while(left < right && !Character.isLetterOrDigit(lower.charAt(left))) {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(lower.charAt(right))) {
                right--;
            }

            if(!(lower.charAt(left) == lower.charAt(right))) {
                
                return false;
            }
            left++;
            right--;

       }

       return true; 
    }
}
