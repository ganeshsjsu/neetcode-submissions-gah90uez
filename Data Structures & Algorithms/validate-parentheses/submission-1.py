class Solution:
    def isValid(self, s: str) -> bool:
        bracket_pair = {')':'(','}':'{',']':'['}
        stack = []
        for i in s:
            if i in bracket_pair and len(stack):
                if stack[-1] != bracket_pair[i]:
                    return False
                else:
                    stack.pop()
            elif i in bracket_pair and not len(stack):
                return False
            else:
                stack.append(i)
            
        return True if not len(stack) else False
            

        