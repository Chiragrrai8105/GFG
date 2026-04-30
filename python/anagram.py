#User function Template for python3
class Solution:
    def areAnagram(ob, S1, S2):
        a=[]
        b=[]
        for s1 in S1:
            a.append(s1)
        for s2 in S2:
            b.append(s2)
        a=sorted(a)
        b=sorted(b)
        if len(a)!=len(b):
            return 0
        for i in range(len(a)):
            if a[i]!=b[i]:
                return 0
        return 1        
            
