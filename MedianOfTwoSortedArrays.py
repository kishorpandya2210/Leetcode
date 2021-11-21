#This implementation does not have a O(log(m+n)) time complexity.
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        def mergeSort(arr):
            if len(arr) > 1:
                mid = len(arr)//2
                L = arr[:mid]
                R = arr[mid:]
                mergeSort(L)
                mergeSort(R)
                i = j = k = 0
                while i < len(L) and j < len(R):
                    if L[i] < R[j]:
                        arr[k] = L[i]
                        i += 1
                    else:
                        arr[k] = R[j]
                        j += 1
                    k += 1
                while i < len(L):
                    arr[k] = L[i]
                    i += 1
                    k += 1
                while j < len(R):
                    arr[k] = R[j]
                    j += 1
                    k += 1
            return arr
        x = []
        x = mergeSort(nums1+nums2)
        print(len(x)/2)
        if(len(x)%2==0):
            return (x[(len(x)//2)-1]+x[len(x)//2])/2
        return x[(len(x)//2)]
        