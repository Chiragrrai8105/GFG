class position {
    public int search(int arr[], int x) {
        int a;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
            
        }
        return -1;
    }
}
