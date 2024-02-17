package StrategyPattern;

public class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private DefenseStrategy[] defenseStrategies;

    public Character(String type, AttackStrategy attackStrategy, DefenseStrategy... defenseStrategy){
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = defenseStrategy;
    }

    public void attack(){
        attackStrategy.attack(type);
    }

    public void defense(){
        for (DefenseStrategy defenseStrategy : defenseStrategies) {
            defenseStrategy.defense();
        }
    }

}