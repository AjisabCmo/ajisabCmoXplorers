package chapterTwo;

import java.util.Scanner;

public class ClassTeaWithIfStatement {
    public static void main(String[] args) {
        Scanner semicolon = new Scanner(System.in);
        System.out.println("""
                press
              1 -> English
              2 -> yoruba
              3-> pidgin
                        """);
        int language = semicolon.nextInt();
        if (language ==1) System.out.println("English");
        if (language==2) System.out.println("Yoruba");
        if (language==3) System.out.println("pidgin");
    }
}
