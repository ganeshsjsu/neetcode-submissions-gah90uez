class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums = sorted(nums)
        res = []
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            first = i + 1
            last = len(nums)-1
            while first < last:
                if nums[i] + nums[first] + nums[last] > 0:
                    last -= 1
                elif nums[i] + nums[first] + nums[last] < 0:
                    first += 1
                else:
                    res.append([nums[i],nums[first],nums[last]])
                    first += 1
                    while nums[first] == nums[first-1] and first < last:
                        first += 1
        return res
            
            

            

             

        