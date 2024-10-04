class Solution(object):
    def check(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        count = 0
        n = len(nums)

        for i in range(1, n):
            if nums[i-1] > nums[i]:
                count += 1

        if nums[n-1] > nums[0]:
            count += 1

        return count == 1 or count == 0
        