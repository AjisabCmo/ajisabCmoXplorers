package chapterSix;

public class BeautifulStrings {
    public static String addFullStopto(String str) {

        return str+".";
    }

    public static String capitalizeFirstLetterIn(String word) {
        String output = "";
        for (int count = 0; count < word.length(); count++) {
            if(count == 0) {
                output = output + (word.charAt(0) + "").toUpperCase();
            }
            else  output +=word.charAt(count);

        }
        return output;

    }

    public static String beautify(String sentence) {

        return addFullStopto(capitalizeFirstLetterIn(sentence));
    }
}
