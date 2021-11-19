class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s)==0:
            return 0
        if len(s)==1:
            return 1
        letters=""
        x=0
        for i in s:
            while i in letters:
                letters=letters[1:]
            letters=letters+i
            x=max(x,len(letters))
        return x