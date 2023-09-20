package chapterTwo;

public class AirConditioner {

    private boolean isOn = false;
    private int temperature = 16;


    public void turnOn() {
        this.isOn = true;

    }

    public boolean checkIsOn() {
        return isOn;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void increaseTemperature() {
        if (temperature < 30) {
            temperature += 1;
        }
    }


    public int checkTemperature() {
     return temperature;

    }

    public void decreaseTemperature() {
        if (temperature > 16 ) {
            temperature -= 1;
        }
    }

    public void increaseTemperatureByNUmberEntered(int number){
        if (temperature < 30){
            temperature+=number;
        }
    }


}