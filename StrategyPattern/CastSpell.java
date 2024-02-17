package StrategyPattern;

public class CastSpell implements AttackStrategy{
    @Override
    public void attack(String type){
        System.out.println(type + " casts a spell!");
    }
}