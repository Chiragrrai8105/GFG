class Solution {
    int firstOccurence(String txt, String pat) {
        boolean bool=false;
        int count=-1;
        for(int i=0;i<txt.length();i++)
        {
            for(int j=i+1;j<pat.length();j++)
            {
                if(pat.charAt(j)==txt.charAt(i))
                {
                    bool=true;
                }
            }
        }
        if(bool==true)
        {
            for(int i=0;i<txt.length();i++)
            {
                if(pat.charAt(0)==txt.charAt(i))
                {
                    count=i;
                    break;
                }
            }
            return count;
        }
        return count;
    }
}