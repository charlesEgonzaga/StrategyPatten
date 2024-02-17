package StrategyPattern;

public class ShootArrow implements AttackStrategy{
    @Override
    public void attack(String type) {
        System.out.println(type + " shoots an arrow!");

    }
}