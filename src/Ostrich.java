public class Ostrich extends Bird {

    Ostrich() {
        setMinWeight(500);
        setRangeWeight(50000);
        setWeightRandom();
        setVoice("Урр");
    }

    @Override
    public void eat() {
        findInsect();
        super.eat();
    }

    private void findInsect() {
    }
}
