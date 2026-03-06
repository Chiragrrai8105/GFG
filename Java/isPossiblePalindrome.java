class isPossiblePalindrome {

    public int demo(String s,int K) {
        String n=s;
        for(int j=0;j<K;j++)
        {
            n+=s.charAt(j);
        }
        int a=n.length()-1;
        for(int b=0;b<n.length();b++)
        {
            if(n.charAt(b)!=n.charAt(a))
            {
                return 0;
            }
            a--;
        }
        return 1;
    }
}