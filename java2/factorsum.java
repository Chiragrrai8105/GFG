class factorsum {
    public static void main(String[] args) {
        int sum=0;
        int n=7;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}