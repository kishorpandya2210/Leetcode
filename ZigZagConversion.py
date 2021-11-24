class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows==1 or numRows>=len(s):
            return s
        L=[]
        for _ in range(numRows):
            L.append('')
        step=1
        index=0
        for ch in s:
            L[index]+=ch
            if(index==0):
                step=1
            elif(index==numRows-1):
                step=-1
            index+=step
        return ''.join(L)
            