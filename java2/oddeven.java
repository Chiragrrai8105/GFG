class oddeven {
    public int[] countOddEven(int[] arr) {
        int c=0,c1=0;
        int ar[]=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                c++;
            }
            else{
                c1++;
            }
            ar[0]=c1;
            ar[1]=c;
        }
        return ar;
    }
}