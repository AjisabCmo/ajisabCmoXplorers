package chapterSeven;

import java.util.Scanner;

public class Mbti {
    public static void main(String[] args) {
        String [] question={
                " A. expand energy,enjoy groups  B. conserve energy, enjoy one-on-one",
                "A. Interpret literally    B. look for meaning and possibilities",
                "A.logical,thinking,questioning    B. empathetic,feeling,accommodating",
                "A.organized,orderly    B.flexible,adaptable",
                "A. more outgoing,think out loud   B. more reserved,think to yourself",
                "A. practical,realistic,experiential   B. imaginative, innovative, theoretical",
                "A. candid, straight forward, frank    B. tactful, kind, encouraging",
                "A. plan, schedule   B. unplanned, spontaneous",
                "A. seek many tasks,public activities,interaction with others    B. seek private, solitary activities with quiet to concentrate",
                "A. standard, usual, conventional    B. different,novel,unique",
                "A. firm, tend to criticize, hold the line    B. gentle, tend to appreciate ,conciliate",
                "A. regulated, structured         B. easy-going,live and let live",
                "A. external, communicative, express yourself     B. internal,reticent, keep to yourself",
                "A. focus on here-and-now      B. look to the future,global perspective,big picture",
                "A. tough-minded,just     B. tender-hearted,merciful",
                "A. preparation,plan ahead    B. go with the flow ,adapt as you go",
                "A. active,initiate       B. reflective,deliberate",
                "A.facts, things, what is     B. ideas, dreams, what could be,philosophical",
                "A. matter of fact, issue-oriented       B. sensitive, people-oriented, compassionate",
                "A. control ,govern       B. latitude, freedom"

        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("whats your name:");
        String name = scanner.nextLine();

        for (int count = 0 ; count < question.length ; count++) {
            System.out.println(question[count]);
            System.out.println("Enter A 0r B");
            String character = scanner.nextLine();

        }

        }

    }

