package coffeemachine.steamer;

import coffee.CoffeeMakingStrategy;
import coffee.LatteMakingStrategy;
import coffeemachine.milktank.MilkTank;
import console.NotEnoughMilkError;
import console.Result;

public class Steamer {

    private MilkTank milkTank;

    public Steamer(MilkTank milkTankRef) {
        this.milkTank = milkTankRef;
    }

    public Result<Integer> steamMilk(CoffeeMakingStrategy coffeeMakingStrategy) {
        return milkTank.currentMilkLevel() >= coffeeMakingStrategy.getRequiredSteamedMilk() ?
                Result.success(milkTank.getMilk(coffeeMakingStrategy.getRequiredSteamedMilk())) :
                Result.error(new NotEnoughMilkError());

    }

    public Result<Integer> foamedMilk(LatteMakingStrategy strategy) {
        return milkTank.currentMilkLevel() >= strategy.getRequiredFoamedMilk() ?
                Result.success(milkTank.getMilk(strategy.getRequiredFoamedMilk())) :
                Result.error(new NotEnoughMilkError());

    }
}
