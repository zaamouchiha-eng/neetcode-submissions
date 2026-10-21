
class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()){
       return false;}

       char[] a = new char[s.length()];
       char[] b = new char[t.length()];
    for (int i = 0; i < s.length(); i++) {
    a[i] = s.charAt(i);
    b[i] = t.charAt(i);
}
       Arrays.sort(a);
       Arrays.sort(b);
     return Arrays.equals(a,b);


    }
}
