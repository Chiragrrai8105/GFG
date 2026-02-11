class palindrome {
    boolean isPalindrome(String s) {
    int r=s.length()-1,l=0;
    while(l<=r)
    {
        if(s.charAt(l)!=s.charAt(r))
        {
            return false;
        }
        l++;
        r--;
    }
    return true;
    }
}