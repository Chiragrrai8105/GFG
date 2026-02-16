class stringcheck {
    public static boolean areAnagrams(String s1, String s2){
        if(s1.length()!=s2.length())
        {
            return false;
        }
        else
        {
            for(int i=0;i<s1.length()-1;i++)
            {
                for(int j=0;j<s2.length()-1;j++)
                {
                    if(s1.charAt(i)==s2.charAt(j))
                    {
                          return true;
                    }
                  
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        String s1="geeks";
        String s2="geaks";
        System.out.println(areAnagrams(s1,s2));
    }
}