public abstract class Bird extends Animal{

    @Override
    public void move(){
    }

    @Override
    public void eat() {
        ingest();
        digest();
    }

    final void digest() {
    }

    final void ingest() {
    }
}
