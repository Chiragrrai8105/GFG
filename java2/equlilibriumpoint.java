class equlilibriumpoint {
    public static int findEquilibrium(int arr[]) {
        // code here
        for(int i=0;i<arr.length;i++)
        {
            int sum=0,sum1=0;
            for (int j=0;j<i;j++)
            {
                sum+=arr[j];
            }
            for(int k=arr.length-1;k>i;k--)
            {
                sum1+=arr[k];
            }
            if(sum==sum1)
            {
                return i;
            }
        }
        return -1;
    }
}