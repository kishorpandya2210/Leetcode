class Solution:
    def search(self, nums: List[int], target: int) -> int:
        def binarySearch(arr, l, r, x):
            if r >= l:
                mid = l + (r - l) // 2
                if arr[mid] == x:
                    return mid
                elif arr[mid] > x:
                    return binarySearch(arr, l, mid-1, x)
                else:
                    return binarySearch(arr, mid + 1, r, x)
            else:
                return -1
        return binarySearch(nums,0,len(nums)-1,target)