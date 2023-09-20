package ChibuzorSnacks;

public class Driller {
    public static int numberOfCopies(int numberOfCopies) {
        int number =1;
        if (numberOfCopies <= 4){
            number=2000;
        }
        if (numberOfCopies >= 5 && numberOfCopies <= 9){
            number =1800;
        }
        if(numberOfCopies >=10 && numberOfCopies <= 29){
            number=1600;
        }
        if(numberOfCopies >=30 && numberOfCopies <= 49){
            number =1500;

        }
        if(numberOfCopies >=50 && numberOfCopies <= 99){
            number =1300;

        }
        if(numberOfCopies >=100 && numberOfCopies <= 199){
            number =1200;

        }
        if(numberOfCopies >=200 && numberOfCopies <= 499){
            number =1100;

        }
        if(numberOfCopies >=500){
            number =1000;

        }
        return number;
    }
}
