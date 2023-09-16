package ChapterThree;

public class Car{
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }



    public void setModel(String model){
        this.model = model;

    }

    public String getModel(){
        return model;
    }

    public void setYear(String year){
        this.year = year;

    }

    public String getYear(){
        return year;
    }

    public void setPrice(double price){

        this.price = 0;

    }

    public double getPrice(){
        return price;

    }

    public double firstCar(){
        double car1 = price * 5/100;
        return car1;

    }
    public double secondCar(){
        double car2 = price * 7/100;
        return car2;


    }

}