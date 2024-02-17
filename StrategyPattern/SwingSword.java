package StrategyPattern;

public class SwingSword implements AttackStrategy{
    @Override
    public void attack(String type) {
        System.out.println(type + " attacks with a sword!");
    }
}