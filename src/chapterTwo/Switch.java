package chapterTwo;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner keyboardInput= new Scanner(System.in);
        System.out.println(""" 
press 
1 -> English
2 -> Yoruba
3 -> Pidgin
              """);
        int userInput=keyboardInput.nextInt();
        switch (userInput){
            case 1:
                System.out.println("English");
                break;
                case 2:
                    System.out.println("Yoruba");
                    break;
            case 3:
                System.out.println("Pidgin");
                System.out.println("you wan speak pidgin? 1 or 2 ");
                int SpeakWafi=keyboardInput.nextInt();
                switch (SpeakWafi){
                    case 1:
                        System.out.println("pidgin mode on");
                        break;
                    case 2:
                        System.out.println("pidgin mode off");
                        break;
                }

        }
    }
}
