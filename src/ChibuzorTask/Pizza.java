package ChibuzorTask;

public class Pizza {
    private String bigPizza;
    private String mediumPizza;
    private String smallPizza;

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        System.out.println(pizza.superHungry("6"));
    }

    public String superHungry(String user){
        bigPizza = "10";
        mediumPizza ="6";
        smallPizza = "4";
        int oneBigPizzaPrice=5000;

//        user = smallPizza;
        if (user.equals(bigPizza)){
//            user = String.valueOf(5000 * 10);
            user = "superHungry";
        }if (user.equals(mediumPizza)) {
            user = "hungry";

        }if (user.equals(smallPizza)) {
            user = "classic";

        }

        return user;
    }
    public static int bigPizza(int oneBigPizzaPrice){

        return oneBigPizzaPrice * 10;
    }
    public static int mediumPizza(int oneMediumPizzaPrice){
        return oneMediumPizzaPrice * 6;
    }
    public static int smallPizza(int oneSmallPizzaPrice){

        return oneSmallPizzaPrice * 4;
    }

}
