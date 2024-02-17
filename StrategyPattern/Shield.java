package StrategyPattern;

public class Shield implements DefenseStrategy{
    @Override
    public void defense() {
        System.out.println("Using a shield to defend!");
    }
}