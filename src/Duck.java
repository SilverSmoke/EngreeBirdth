public class Duck extends Bird implements FlyingBird {

    Duck() {
        setMinWeight(100);
        setRangeWeight(5000);
        setWeightRandom();
        setVoice("Кря-кря");
    }

    public void swim(){

    }

    @Override
    public void eat() {
        catchFish();
        super.eat();
    }

    private void catchFish() {
    }

    @Override
    public void fly() {

    }
}
