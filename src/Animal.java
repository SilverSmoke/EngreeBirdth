public abstract class Animal{

    private double weight;

    private String voice;

    private int minWeight;

    private int rangeWeigh;

    protected void setMinWeight(int minWeight) {
        this.minWeight = minWeight;
    }

    protected void setRangeWeight(int rangeWeigh) {
        this.rangeWeigh = rangeWeigh;
    }

    protected int getRangeWeight() {
        return rangeWeigh;
    }

    protected int getMinWeight() { return minWeight; }

    protected double getWeight() {
        return weight;
    }

    protected void setWeightRandom() {
        this.weight = getMinWeight() + getRangeWeight() * Math.random();
    }

    protected void setVoice(String voice) {
        this.voice = voice;
    }

    private String getVoice() {
        return voice;
    }

    protected void voice(){
        System.out.println(this.getClass().getName() + " says" + ": -" + getVoice() + ". Мой вес: " + getWeight() + " грамм.");
    }

    abstract void move();

    abstract void eat();
}
