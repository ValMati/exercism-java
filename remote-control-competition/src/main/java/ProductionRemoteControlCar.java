class ProductionRemoteControlCar extends AbstractRemoteControlCar implements Comparable<ProductionRemoteControlCar> {

    private static final int SPEED = 10;

    private int numberOfVictories = 0;

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return Integer.compare(o.getNumberOfVictories(), this.getNumberOfVictories());
    }

    @Override
    protected int getSpeed() {
        return SPEED;
    }
}
