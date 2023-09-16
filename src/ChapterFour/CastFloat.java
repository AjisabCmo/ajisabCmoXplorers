package ChapterFour;

public class CastFloat{
        public static void main(String[] args) {
            int result=1;
            int first=1;
            int firstPower=2;
    
            for (int count = 1; count <= 2; count++) {
                result *= 1;
    
            }
    int result2 = 1;
    int secondPower = 3;
    int second = 2;
    
    
    // loop for 2 raise to the power of 3
    
            for (int count = 1; count <= 3; count++){
                result2 *= 2;
    
            }
    
           int result3=1;
            int thirdPower=4;
            int third =3;
            for (int count =1;count <=4;count++) {
                result3 *= 3;
            }
    
            int result4=1;
            int fourPower=5;
            int four = 4;
            for (int count= 1;count<=5;count++){
                result4 *=4;
            }
            int result5=1;
            int fivePower=6;
            int five =5;
            for (int count=1;count<=6;count++){
                result5 *=5;
            }
    
            System.out.println("a\tb\tpow(a,b)");
            System.out.printf("%d\t%d\t%d",first,firstPower,result);
            System.out.println();
            System.out.printf("%d\t%d\t%d",second,secondPower,result2);
            System.out.println();
            System.out.printf("%d\t%d\t%d",third,thirdPower,result3);
            System.out.println();
            System.out.printf("%d\t%d\t%d",four,fourPower,result4);
            System.out.println();
            System.out.printf("%d\t%d\t%d",five,fivePower,result5);
    
        }
    }
