package coffeemachine.counters;

public interface Counter {

    int getWaterCount();

    void reduceCount();

    void setWaterCount(int i);


    void resetWaterCount();


}
