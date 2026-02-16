import java.util.Arrays;
class anagram {
    public static boolean areAnagrams(String s1, String s2){
        char[] ar1=s1.toCharArray();
        char[] ar2=s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(s1.length()!=s2.length())
        {
            return false;
        }
        else
        {
           return Arrays.equals(ar1,ar2);
        }
    }
}