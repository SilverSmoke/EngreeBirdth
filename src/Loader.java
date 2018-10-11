import java.util.ArrayList;
import java.util.Collections;

public class Loader {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        getAnimals(animals);

        for(Animal animal : animals) {
            animal.voice();
        }

        System.out.println("===========================================================");

        Collections.sort(animals, new AnimalComporator());

        for(Animal animal : animals) {
            animal.voice();
        }
    }

    private static void getAnimals(ArrayList<Animal> animals) {
        animals.add(new Duck());
        animals.add(new Duck());
        animals.add(new Duck());
        animals.add(new Duck());
        animals.add(new Sparrow());
        animals.add(new Sparrow());
        animals.add(new Sparrow());
        animals.add(new Sparrow());
        animals.add(new Ostrich());
        animals.add(new Ostrich());
        animals.add(new Ostrich());
        animals.add(new Ostrich());
        animals.add(new Chicken());
        animals.add(new Chicken());
        animals.add(new Chicken());
        animals.add(new Chicken());
    }
}