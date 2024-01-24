package ChapterThree;

import java.util.Scanner;

public class PersonTest {



        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            Person person = new Person ();

            System.out.println("whats your name :");
            String name = scanner.next();
            person.setName(name);
            System.out.println("the name is "+person.getName());
//            String newName = person.getName();

//            System.out.print(newName);
            System.out.println("whats your age :");
            int age = scanner.nextInt();
            person.setAge(age);
            System.out.println("the age is " + person.getAge());

//            int  newAge = Integer.parseInt(person.getName());

//            System.out.print (newAge);
        }

    }

