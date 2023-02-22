package SOLIDPrinciples.LiskovSubstitution.WithoutLiskov;

public class Bicycle implements Bike {

    int speed;

    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}
