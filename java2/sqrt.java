class sqrt{
    int floorSqrt(int n) {
        for(int i=2;i<n/2;i++)
        {
            if(i*i==n)
            {
                return i;
            }
        }
        for(int i=0;i<n/2;i++)
        {
            if(i*i>n)
            {
                int a=i-1;
            }
        }
        return a;
    }
}