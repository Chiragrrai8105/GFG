class Solution:
    def evenlyDivides(self, n):
        count=0
        n1=[int(j) for j in str(n)]
        for i in n1:
            if i==0:
                continue
            if n%i==0:
                count+=1
        return count            