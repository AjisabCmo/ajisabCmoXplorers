package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class Mbti {
    public static void main(String[] args) {
        String[][] question = {
                {" A. expand energy,enjoy groups "}, {" B. conserve energy, enjoy one-on-one"},
                {"A. Interpret literally  "}, {"  B. look for meaning and possibilities"},
                {"A.logical,thinking,questioning "}, {"   B. empathetic,feeling,accommodating"},
                {"A.organized,orderly  "}, {"  B.flexible,adaptable"},
                {"A. more outgoing,think out loud "}, {"  B. more reserved,think to yourself"},
                {"A. practical,realistic,experiential"}, {"  B. imaginative, innovative, theoretical"},
                {"A. candid, straight forward, frank "}, {"   B. tactful, kind, encouraging"},
                {"A. plan, schedule "}, {"B. unplanned, spontaneous"},
                {"A. seek many tasks,public activities,interaction with others "}, {"   B. seek private, solitary activities with quiet to concentrate"},
                {"A. standard, usual, conventional  "}, {"  B. different,novel,unique"},
                {"A. firm, tend to criticize, hold the line  "}, {" B. gentle, tend to appreciate ,conciliate"},
                {"A. regulated, structured    "}, {"   B. easy-going,live and let live"},
                {"A. external, communicative, express yourself"}, {" B. internal,reticent, keep to yourself"},
                {"A. focus on here-and-now  "}, {"  B. look to the future,global perspective,big picture"},
                {"A. tough-minded,just  "}, {"   B. tender-hearted,merciful"},
                {"A. preparation,plan ahead  "}, {" B. go with the flow ,adapt as you go"},
                {"A. active,initiate  "}, {" B. reflective,deliberate"},
                {"A.facts, things, what is  "}, {"   B. ideas, dreams, what could be,philosophical"},
                {"A. matter of fact, issue-oriented "}, {" B. sensitive, people-oriented, compassionate"},
                {"A. control ,govern   "}, {"    B. latitude, freedom"}

        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("whats your name:");
        String name = scanner.nextLine();
        displayResponses(question);
    }

    public static void displayResponses(String[][] question) {
        String[] result = new String[question.length / 2];
        Scanner scanner = new Scanner(System.in);
              int col= 0;
        for (int count = 0; count < question.length; count++) {
            for (int index = 0; index < question[count].length; index++) {

                System.out.println(question[count][index] + " " + question[count + 1][index]);
                System.out.println("Enter A 0r B");
                String character = scanner.nextLine();
                while (!character.equals("A") && !character.equals("B")) {
                    System.out.println("I know this is an error, Please retry again");
                    System.out.println(question[count][index] + " " + question[count + 1][index]);
                    System.out.println("Enter A or B: ");
                    character = scanner.next();
                }
                if (character.equals("A")) {
                    result[col] = character + " " + question[count][index];
                    col++;
                }
                if (character.equals("B")) {
                    result[col] = character + " " + question[count + 1][index];
                    col++;
                }
                count += 1;

            }
        }
        System.out.println(Arrays.toString(result));
        separateResponses(result);

    }

    public static void separateResponses(String[] result) {
        int count = 0;
        for (int index = 0; index < result.length; index += 4) {
            count++;
        }

    }
}


