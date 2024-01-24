package MyOwnExercise;

public class HouseName {
   
     private String name = "simbiat Ajiboye" ;
     private String SecondName="Abdullahi Ajiboye";

     private String address = "16 odungbori str suberu oje alagbado lagos state";



    public static void main(String[] args) {
        HouseName honey = new HouseName();

        System.out.println(honey.getName());
        System.out.println(honey.getSecondName());
        System.out.println(honey.getAddress());
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  void setName(String name ) {
        this.name = name ;


    }
    public String getName(){

        return name ;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }
}
