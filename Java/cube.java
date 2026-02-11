class cube {
    public static boolean isPowerofTwo(int n) {
        int m=1;
        for(int i=0;i<n;i++)
        {
            m*=2;
            if(n==1)
            {
                return true;
            }
            if(m==n)
            {
                return true;
            }
        }
        return false;
        
    }
}