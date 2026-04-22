// User function Template for Java
class Solution {
    static int setBits(int n) {
        int bit=0;
        for(int i=31;i>=0;i--)
        {
            bit+=(n>>i)&1;
        }
        return bit;
    }
}