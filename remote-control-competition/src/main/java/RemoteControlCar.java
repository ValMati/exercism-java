public interface RemoteControlCar {

    void drive();

    int getDistanceTravelled();
}

abstract class AbstractRemoteControlCar implements RemoteControlCar {
    protected abstract int getSpeed();

    private int distanceTraveled = 0;

    public void drive() {
        distanceTraveled += getSpeed();
    }

    public int getDistanceTravelled() {
        return distanceTraveled;
    }
}
