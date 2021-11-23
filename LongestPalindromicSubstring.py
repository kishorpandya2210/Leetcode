#This solution does not work for longer strings.
class Solution:
    def longestPalindrome(self, s: str) -> str:
        longestPalindromeString=""
        def checkPalindrome(x: str) -> bool:
            if len(x)==1:
                return True
            return x==x[::-1] 
        for i in range(1,len(s)+1):
            start=0
            while start+i<=len(s):
                if checkPalindrome(s[start:start+i]):
                    if len(s[start:start+i])>len(longestPalindromeString):
                        longestPalindromeString=s[start:start+i]
                start=start+1
        return longestPalindromeString