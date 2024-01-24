import AnimalKingdom.Animal;
import AnimalKingdom.Cat;
import AnimalKingdom.Dog;
import AnimalKingdom.LivingThing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {






    @Test
    public void testMove(){
        Cat cat = new Cat();
        cat.move();

    }
    @Test
    public void testRun(){
        Animal animal = new Animal();
        animal.move();
    }
    @Test
    public void testThatDogCanMove(){
        Dog dog = new Dog();
        dog.move();

    }
    @Test
    public void testForLivingThing(){
        LivingThing livingThing = new LivingThing();
        livingThing.move();
    }
}
