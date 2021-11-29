class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for i in s:
            if i==')':
                if len(stack)==0 or stack.pop()!='(':
                    return False
                else:
                    continue
            if i=='}':
                if len(stack)==0 or stack.pop()!='{':
                    return False
                else:
                    continue
            if i==']':
                if len(stack)==0 or stack.pop()!='[':
                    return False
                else:
                    continue
            stack.append(i)
        return len(stack)==0