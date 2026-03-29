class Solution {
    int floorSqrt(int n) {
        int a=0;
        if(n==1||n==0)
        return 1;
        for(int i=1;i*i<=n;i++)
        {
            a=i;
        }
       return a;
    }
}