class Solution:    
    def findUnion(self, a, b):
        c=[]
        for i in a:
            c.append(i)
        for i in b:
            c.append(i)
        c.sort()
        c=set(c)
        return c
        
                