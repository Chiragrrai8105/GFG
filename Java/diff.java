
class diff {
    public boolean findPair(int[] arr, int x) {
        for(int i=0;i<arr.length+1;i++)
        for(int j=i+1;j<arr.length;j++)
        if(arr[i]-arr[j]==x||arr[j]-arr[i]==x)
        return true;
        return false;
    }
}
