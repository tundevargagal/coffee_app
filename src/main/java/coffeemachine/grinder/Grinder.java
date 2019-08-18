package coffeemachine.grinder;

import coffee.CoffeeMakingStrategy;
import coffeemachine.beantank.IBeanTank;
import coffeemachine.counters.Counter;
import coffeemachine.watertank.IWaterTank;
import console.NotEnoughBeansError;
import console.NotEnoughWaterError;
import console.RequiredDescalingError;
import console.Result;

public class Grinder {

    private IWaterTank waterTank;
    private IBeanTank beanTank;
    private Counter counter;

    public Grinder(IWaterTank waterTankRef, IBeanTank beanTankRef, Counter counter) {
        this.waterTank = waterTankRef;
        this.beanTank = beanTankRef;
        this.counter = counter;
    }

    public Result<Integer> brew(CoffeeMakingStrategy coffeeMakingStrategy) {
        waterTank.getWater(coffeeMakingStrategy.getRequiredWater());
        beanTank.getBeans(coffeeMakingStrategy.getRequiredBeans());
        return checkWaterLevel(coffeeMakingStrategy.getRequiredWater())
                .flatMap(x -> checkBeanLevel(coffeeMakingStrategy.getRequiredBeans()))
                .flatMap(y -> getSuccess(coffeeMakingStrategy));
    }

    private Result<?> checkBeanLevel(int requiredBeans) {
        return beanTank.currentBeanTankLevel() >= requiredBeans ? Result.success(this) : Result.error(new NotEnoughBeansError());
    }

    private Result<?> checkWaterLevel(int requiredWater) {
        return waterTank.currentWaterLevel() >= requiredWater ? Result.success(this) : Result.error(new NotEnoughWaterError());
    }

    private Result<?> checkCounterLevel() {
        return counter.getWaterCount() >= 1 ? Result.success(this) : Result.error(new RequiredDescalingError());
    }

    private Result<Integer> getSuccess(CoffeeMakingStrategy coffeeMakingStrategy) {
        counter.reduceCount();
        return Result.success(coffeeMakingStrategy.getRequiredWater() + (coffeeMakingStrategy.getRequiredBeans() / 10));
    }


}
