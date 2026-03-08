 class Palindromewithbuiltinfunction{
    static String revStr(String s) {
       StringBuilder a = new StringBuilder(s);
       a.reverse();
       String rev=a.toString();
       return rev;
    }
}