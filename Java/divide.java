// User function Template for Java

class divide {
    static int evenlyDivides(int n) {
        int count=0,n1=n;
        while(n1>0)
        {
            int a=n1%10;
            if(a==0)
            {
            continue;
            }    
            else if (n%a==0)
            {
                count++;
            }
            n1/=10; 
    }
    return count;
}
    public static void main(String[] args)
    {
        System.out.println(evenlyDivides(20));
    }
}