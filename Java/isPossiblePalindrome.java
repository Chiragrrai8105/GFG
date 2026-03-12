public class isPossiblePalindrome {

    public static int demo(String s,int K) {
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
    public static void main(String[] args) {
        String s="abac";
        int K=2;
        System.out.println(demo(s,K));
    }
}