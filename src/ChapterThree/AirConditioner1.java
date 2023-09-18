package ChapterThree;

public class AirConditioner1 {

        private boolean isOn;
        private String productName;
        private int temperature;


        public AirConditioner1(String productName){
            this.productName = productName;

        }


        public void setOn(boolean isOn){
            this.isOn = isOn;
        }

        public boolean isOn(){
            return isOn;
        }

        public void setProductName(String productName){
            this.productName = productName;
        }

        public String getProductName(){
            return productName;
        }


        public void increaseTemperature(){
            temperature = temperature +1;

        }

        public void decreaseTemperature(){
            temperature = temperature -1;

        }

        public void setTemperature(int temperature){
            this.temperature = temperature;

        }

        public int getTemperature(){
            return temperature;

        }

    }

