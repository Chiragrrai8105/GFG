public class neg3{
    public static void main(String[] args)
    {
    int i=1,count=0,N=25;
            while(i<=N)
            {
                int j=i,a=0;
                while(j>0)
                {
                    int num=j%10;
                    if(num==3)
                    {
                        a=1;
                        break;
                    }
                    else
                    {
                        j/=10;
                    }
                }
                if(a==0)
                {
                    count++;
                }
                i++;
            }
            System.out.println(count);
    }
}