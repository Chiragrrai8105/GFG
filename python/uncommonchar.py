class Solution:
    # Function to find uncommon characters between two strings.
    def uncommonChars(self, s1, s2):
        s=""
        for i in s1:
            if i not in s2:
                s+=i
        for i in s2:
            if i not in s1:
                s+=i
        return "".join(sorted(set(s)))        
            