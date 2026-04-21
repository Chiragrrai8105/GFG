class Solution {
    public char nonRepeatingChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char S:s.toCharArray())
        {
            map.put(S,map.getOrDefault(S,0)+1);
        }
        for(char c:s.toCharArray())
        {
            if(map.get(c)==1)
            {
                return c;
            }
        }
        return '$';
    }
}