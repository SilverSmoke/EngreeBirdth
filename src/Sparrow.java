public class Sparrow extends Bird implements FlyingBird{

    Sparrow() {
        setMinWeight(20);
        setRangeWeight(200);
        setWeightRandom();
        setVoice("Чик-чирик");
    }

    @Override
    public void eat() {
        catchMosquito();
        ingest();
        digest();
    }

    private void catchMosquito() {
    }

    @Override
    public void fly() {

    }
}
