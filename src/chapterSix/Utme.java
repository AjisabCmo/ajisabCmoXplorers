package chapterSix;

public class Utme {

    public static int testDriller(int numberOfCopies){

        int number=1;

        if (numberOfCopies <=4){
            number = 2000;
        }
        else if (numberOfCopies>=5 && numberOfCopies <=9) {
            number =  1800;


        }
        else if (numberOfCopies >=10 && numberOfCopies <=29) {
            number=  1600;

        }
        else if (numberOfCopies >=30 && numberOfCopies <=49){
            number= 1500;
        }
        else if (numberOfCopies >=50 && numberOfCopies <=99){
            number= 1300;
        }
        else if (numberOfCopies >=100 && numberOfCopies <=199){
            number= 1200;

        }
        else if (numberOfCopies >=200 && numberOfCopies <=499){
            number = 1100;
        }
        else if (numberOfCopies >=500) {
            number =  1000;

        }
        return number;
    }

    public static void main(String[] args) {
        int result = testDriller(3);
        System.out.println(result);
    }
}
