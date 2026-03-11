// User function Template for Java

class rem {
    static int evenlyDivides(int n) {
        int n1=n,count=0;
        while(n1>0)
        {
            int rem=n1%10;
            if(rem==0)
            {
                continue;
            }
            else if(n%rem==0)
            {
                count++;
            }
            n1/=10;
        }
        return count;
    }
}