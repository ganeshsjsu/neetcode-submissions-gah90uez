class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        for i in range(len(numbers)):
            val = target - numbers[i]
            if val in numbers and numbers.index(val) < i:
                return [numbers.index(val)+1,i+1]
        return []
        