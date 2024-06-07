public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Warrior warrior = new Warrior("Warrior", 100, 100, 1, 100, 100);
        Mage mage = new Mage("Mage", 100, 100, 1, 10, 10);
        Rogue rogue = new Rogue("Rogue", 100, 100, 1, 10, 10);

        mage.displayInfo();
        warrior.displayInfo();;
        rogue.displayInfo();
        warrior.attack(mage);
        mage.castSpell("crucio", warrior);
        rogue.attack(warrior);
        warrior.attack(mage);
        mage.displayInfo();
        mage.castSpell("crucio", rogue);
        rogue.displayInfo();
        mage.heal(rogue);
        rogue.displayInfo();

    }
}