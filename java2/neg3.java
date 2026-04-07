public class neg3{
    public static void main(String[] args)
    {
    int i=1,count=0,N=25;
            while(i<=N)
            {
                while(i<0)
                {
                    int num=i&10;
                    if(num==3)
                    {
                        break;
                    }
                    else
                    {
                        i/=10;
                    }
                }
            }
            System.out.println(count);
    }
}