class max:
    def leaders(self, arr):
        lis=[]
        for i in range(len(arr)):
            bool=True
            for j in range(i+1,len(arr)):
                if arr[i]<arr[j]:
                    bool=False
            if bool==True:
                lis.append(arr[i])
        return lis        
                
                    