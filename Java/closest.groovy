class clo {
    static int closestNumber(int n, int m) {
        if(n>0)
        {
            if(m>0)
            {
                if(n>m)
                {
                    for(int i=n;i>0;i--)
                    {
                        if(i%m==0)
                        {
                            return i;
                        }
                    }
                }
                else
                {
                    for(int i=n;i>(n+10);i++)
                    {
                        if(i%m==0)
                        {
                            return i;
                        }
                    }
                }
                
            }
            else
            {
                for(int i=n;i<(n+20);i++)
                {
                    if(i%m==0)
                    {
                        return i;
                    }
                }
            }
        }
        else
        {
            for(int i=n;i>(n-20);i--)
            {
                if(i%m==0)
                {
                    return i;
                }
            }
        }
        return 0;
    }
}