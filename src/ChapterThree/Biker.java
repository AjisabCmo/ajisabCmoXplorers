package ChapterThree;

public class Biker {
    private boolean isOn;


    private int speed;
    private int gear;


   // public Biker() {
      //  isOn = false;
      //  speed = 0;
      //  gear = 0;
   // }


    public void turnOn() {
        this.isOn = true;
        this.gear = 1;
        this.speed = 1;
    }

    public boolean checkIsOn() {
        return isOn;
    }

    public void turnOff() {
        this.isOn = false;
        this.gear = 0;
        this.speed = 0;
    }

    public void accelerateSpeed() {
        if (speed <= 20 && speed >= 0) {
            speed += 1;
            gear = 1;
        } else {
            if (speed >= 21 && speed <= 30) {
                this.gear = 2;
                speed += 2;

            } else if (speed >= 31 && speed <= 40) {
                speed += 3;
                gear = 3;
            } else if (speed >= 41) {
                gear = 4;
                speed += 4;

            }
        }


    }

    public int checkSpeed() {
        return speed;
    }


    public int checkGear() {
        return gear;
    }


    public void deaccelerateSpeed() {
        if (speed <= 20 && speed >= 0) {
            speed -= 1;
            gear = 1;
        } else {
            if (speed >= 21 && speed <= 30) {
                speed = speed -2;
                gear=2;
            } else if (speed >= 31 && speed <= 40) {
                speed =speed  -3;
                gear = 3;
            } else if (speed >= 41) {
                gear = 4;
                speed -= 4;

            }
        }
    }
}













