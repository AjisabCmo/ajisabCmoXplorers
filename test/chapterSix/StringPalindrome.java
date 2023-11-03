package chapterSix;

public class StringPalindrome {

    public static boolean forIsPalindrome(String str) {
        int word = str.length();

        for (int count = 0; count < word; count++) {
            if (str.charAt(count) != str.charAt(word - count - 1)) {
                return false;
            }
        }


        return true;
    }


  public static boolean forIsAnagram(String s1, String s2) {


   if (s1.length()!=s2.length()){
       return  true;
   }

      return false;
  }
   }


