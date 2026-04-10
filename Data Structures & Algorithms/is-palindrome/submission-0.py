
class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = ''.join(ch.lower() for ch in s if ch.isalnum())
        print(s[-1:])

        if s == s[-1::-1]:
            return True
        return False
                
        