package StrategyPattern;


public class GameApp {
    public static void main(String[] args){

        Character knight = new Character("Knight", new SwingSword(), new Shield(), new Dodge(), new CreateMagic());
        Character wizard = new Character("Wizard", new CastSpell(), new CreateMagic());
        Character archer = new Character("Archer", new ShootArrow(), new Shield());

        knight.attack();
        knight.defense();
        System.out.println();

        wizard.attack();
        wizard.defense();
        System.out.println();

        archer.attack();
        archer.defense();
    }

}