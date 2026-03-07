#User function Template for python3

class intersection:
    def commonElements(self, arr1, arr2, arr3):
        arr=[]
        arr4=[]
        arr1=set(arr1)
        arr2=set(arr2)
        arr3=set(arr3)
        for i in arr1:
            for j in arr2:
                if i==j:
                    arr.append(i)
        for k in arr:
            for p in arr3:
                if k==p:
                    arr4.append(p)
        arr4.sort()
        return arr4
            
                