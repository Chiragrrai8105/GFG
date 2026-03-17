from collections import Counter
class Solution:
    def majorityElement(self, arr):
        n = len(arr)
        con = n/2
        Count = Counter(arr)
        for element in arr:
            if Count[element] > con:
                return element
        return -1