public class Chicken extends Bird{

    Chicken() {
        setMinWeight(50);
        setRangeWeight(3000);
        setWeightRandom();
        setVoice("Ko-Ko");
    }

    private void dabGrains() {

    }

    @Override
    public void eat() {
        dabGrains();
        super.eat();
    }
}
