class Solution:
    def hammingWeight(self, n: int) -> int:
        count = 0
        for i in range(32):
            bit = n >> i
            if bit&1 == 1:
                count +=1
        return count
        