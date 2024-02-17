package StrategyPattern;

public class Dodge implements DefenseStrategy{
    @Override
    public void defense() {
        System.out.println("Dodging to avoid attack!");
    }
}