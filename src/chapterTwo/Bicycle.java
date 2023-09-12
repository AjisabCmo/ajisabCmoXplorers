package chapterTwo;

public class Bicycle {
    private boolean isOn;

    private int speed;

    public int checkSpeed() {
        return speed;
    }
    public void Speed(){

        this.speed = speed;
    }

    public void turnOn() {
        this.isOn = true;

    }

    public boolean checkIsOn() {
        return isOn;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void accelerate(){
        if (isOn){
            speed++;

        }else {
            if (speed<20){
                speed+=1;

            }
            else if (speed<=30){
                speed+=2;
            } else if (speed <=40) {
                speed+=3;

            }else if (speed <46){
                speed+=4;
            }
        }
    }


}
