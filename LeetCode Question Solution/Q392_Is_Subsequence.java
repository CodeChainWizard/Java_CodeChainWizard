/**
 * Q392_Is_Subsequence
 */
public class Q392_Is_Subsequence {

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
    
    static boolean isSubsequence(String s, String t){
       int i = 0, j = 0;
       char c_s[] = s.toCharArray();
       char c_t[] = t.toCharArray();

       if(s.length() < 1){
        return true;
       }

       while (i<t.length()) {
            if(c_s[j] == c_t[i]){
                j++;
            }
            i++;
       }
       if(j == s.length()){
        return true;
       }
        return false;
    }
}