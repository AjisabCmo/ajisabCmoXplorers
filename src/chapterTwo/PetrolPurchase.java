package chapterTwo;

public class PetrolPurchase{
    private String stationLocation;

    private String typeOfPetrol;

    private int quantityOfPurchaseInLiter;

    private double pricePerLiter;

    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String typeOfPetrol, int quantityOfPurchaseInLiter, double pricePerLiter, double percentageDiscount ){
        this.stationLocation=stationLocation;
        this.typeOfPetrol =typeOfPetrol;
        this.quantityOfPurchaseInLiter = quantityOfPurchaseInLiter;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;

    }

    public void setStationLocation(String stationLocation){
        this.stationLocation = stationLocation;


    }

    public String getStationLocation(){
        return stationLocation;
    }

    public void setTypeOfPetrol(String typeOfPetrol){
        this.typeOfPetrol = typeOfPetrol;
    }

    public String getTypeOfPetrol(){
        return typeOfPetrol;
    }

    public void setQuantityOfPurchaseInLiter(int quantityOfPurchaseInLiter){
        this.quantityOfPurchaseInLiter = quantityOfPurchaseInLiter;
    }
    public int getQuantityOfPurchaseInLiter(){
        return quantityOfPurchaseInLiter;
    }

    public void setPricePerLiter(double pricePerLiter){
        this.pricePerLiter = pricePerLiter;
    }

    public double getPricePerLiter(){
        return pricePerLiter;
    }

    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;

    }

    public double getPercentageDiscount(){
        return percentageDiscount;
    }

    public double getPurchaseAmount(){

        return ( quantityOfPurchaseInLiter * pricePerLiter) - percentageDiscount;


    }

}








