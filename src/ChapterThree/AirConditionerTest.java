package ChapterThree;

public class AirConditionerTest {


        public static void main(String[] args){

            AirConditioner1 mine = new AirConditioner1("ismail");


            mine.setOn(true);

            System.out.println(mine.isOn());

            mine.setProductName("ismail");
            String newProductName = mine.getProductName();
            System.out.println("This product name is " + newProductName);

            mine.setTemperature(23);
            int newTemperature = mine.getTemperature();
            System.out.println("This temperature is " + newTemperature);

            mine.setTemperature(25);
            mine.increaseTemperature();
            System.out.println("The ac increase to " + mine.getTemperature());

            mine.decreaseTemperature();
            System.out.println("The ac decrease to " + mine.getTemperature());

        }

    }


