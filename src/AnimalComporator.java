import java.util.Comparator;

public class AnimalComporator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return (int) Math.round(o1.getWeight() - o2.getWeight());
    }
}
