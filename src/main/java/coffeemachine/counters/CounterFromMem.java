package coffeemachine.counters;

public class CounterFromMem implements Counter {
    private int counter = 100;

    @Override
    public int getWaterCount() {

        return counter;
    }

    public void setWaterCount(int value) {
        this.counter = value;
    }

    @Override
    public void reduceCount() {
        setWaterCount(getWaterCount() - 1);
    }


}
