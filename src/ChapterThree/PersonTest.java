package ChapterThree;

public class PersonTest {



        public static void main(String[] args){

            Person person = new Person ();

            person.setName("ismail");

            String newName = person.getName();

            System.out.print(newName);

            person.setAge(32);

            int  newAge = Integer.parseInt(person.getName());

            System.out.print (newAge);
        }

    }

