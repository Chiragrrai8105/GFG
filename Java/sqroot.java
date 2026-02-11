
class sqroot {
    static int countSquares(int n) {
        int c=0;
        for(int i=1;i<n;i++)
            for(int j=1;j<=i;j++)
                if(j*j==i)
                    c++;
        return c;
    }
}