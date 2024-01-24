package AnimalKingdom;

public class AnimalTest {
    public static void main(String[] args) {
        Animal [] animal = new Animal[4];
        animal[0]=new Animal();
        animal[1] = new Cat();
        animal[2] = new Dog();
        animal[3] = new LivingThing();
        for (Animal a : animal){
         a.move();

        }
    }
}
