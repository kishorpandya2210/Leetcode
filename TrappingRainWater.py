class Solution:
    # Two-pointer O(n) solution.
    def trap(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        lm = 0
        rm = 0
        totalWater = 0
        while l<r:
            if height[l]<height[r]:
                if height[l]>=lm:
                    lm = height[l]
                else:
                    totalWater += lm - height[l]
                l += 1
            else:
                if height[r]>=rm:
                    rm = height[r]
                else:
                    totalWater += rm - height[r]
                r -= 1
        return totalWater