package chapterTwo;



    import java.util.Scanner;

    public class MyOwnBread{

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.println("Enter an integer:");

            int number = input.nextInt();
            int divided =(number)%3;

            if(number%3 ==0){
                System.out.println("The number "+number+" is divided by 3");
            }if
                (number%3!=0){
                System.out.println("The number"+number+" is not divided by 3");
            }
        }
}
