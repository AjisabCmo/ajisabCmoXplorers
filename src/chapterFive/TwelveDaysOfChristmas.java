package chapterTwo;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//
//            System.out.println("""
//                    for the twelve day of christmas
//                    1.first day of christmas
//                    2.second day of christmas
//                    3. Third day of christmas
//                    4. fourth day of christmas
//                    5.  fifth day of christmas
//                    6.Sixth day of christmas
//                    7. Seventh day of christmas
//                    8. eighth day of Christmas
//                    9.Nineth day of christmas
//                    10.Tenth day of christmas
//                    11.Eleventh day of christmas
//                    12.Twelfth day of christmas
//                                               """);
//            int Song = scanner.nextInt();

        for (int count = 1; count <= 12; count++) {
            switch (count) {
                case 1:

                    System.out.print("""
                                  
                            On the first day of Christmas, my true love sent to me                         
                            """);

                    break;


                case 2:
                    System.out.println();
                    System.out.print("""    
                            
                            On the second day of Christmas, my true love sent to me                         
                            """);

                    break;


                case 3:
                    System.out.println();
                    System.out.print("""
                                                       
                       On the third day of Christmas, my true love sent to me
                         """);

                    break;

                case 4:
                    System.out.println();
                    System.out.print("""
                                                       
                            On the fourth day of Christmas, my true love sent to me
                              """);

                    break;

                case 5:
                    System.out.println();
                    System.out.print("""
                               
                            On the fifth day of Christmas, my true love sent to me
                              """);

                    break;

                case 6:
                    System.out.println();
                    System.out.print("""
                                                       
                            On the sixth day of Christmas, my true love sent to me
                             """);

                    break;

                case 7:
                    System.out.println();
                    System.out.print("""
                                                       
                            On the seventh day of Christmas, my true love sent to me
                             """);

                    break;

                case 8:
                    System.out.println();
                    System.out.print("""
                              
                            On the eighth day of Christmas
                            my true love sent to me
                             """);

                    break;

                case 9:
                    System.out.println();
                    System.out.print("""
                                                       
                            On the ninth day of Christmas, my true love sent to me
                            """);

                    break;

                case 10:
                    System.out.println();
                    System.out.print("""
                                                       
                            On the tenth day of Christmas, my true love sent to me
                           """);

                    break;

                case 11:
                    System.out.println();
                    System.out.print("""
                                                        
                            On the eleventh day of Christmas, my true love sent to me
                            """);

                    break;

                case 12:
                    System.out.println();
                    System.out.print("""    
                             
                            On the twelfth day of Christmas, my true love sent to me
                            """);
            }

            switch (count) {
                case 12:
                    System.out.print("Twelve drummers drumming");
                    System.out.println();
                case 11:
                    System.out.print("Eleven pipers piping");
                    System.out.println();
                case 10:
                    System.out.print("Ten lords a-leaping");
                    System.out.println();
                case 9:
                    System.out.print(" Nine ladies dancing");
                    System.out.println();
                case 8:
                    System.out.print("Eight maids a-milking");
                    System.out.println();
                case 7:
                    System.out.print("Seven swans a-swimming");
                    System.out.println();
                case 6:
                    System.out.print("Six geese a-laying");
                    System.out.println();
                case 5:
                    System.out.print("Five golden rings");
                    System.out.println();
                case 4:
                    System.out.print("Four calling birds");
                    System.out.println();
                case 3:
                    System.out.print("Three french hens");
                    System.out.println();
                case 2:
                    System.out.print("Two turtle doves");
                    System.out.println();
                case 1:
                    System.out.print("A partridge in a pear tree");


            }
        }
    }
}


