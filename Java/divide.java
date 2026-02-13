// User function Template for Java

class divide {
    static int evenlyDivides(int n) {
        int count=0,n1=n;
        while(n1>0)
        {
            int a=n1%10;
            if(n%a==0 && a!=0)
            {
                count++;
            }
            n1/=10;
        }    
        return count;
    }
    public static void main(String[] args)
    {
        System.out.println(evenDivides(20));
    }
}