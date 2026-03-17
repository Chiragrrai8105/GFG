from collections import Counter
class Solution:
    #Function to check if a is a subset of b.
    def isSubset(self, a, b):
        c_a=Counter(a)
        c_b=Counter(b)
        for i in b:
            if c_a[i]<c_b[i]:
                return False
        return True        
            