public class Mage extends Character{
    private int intelligence;
    private int spell;
    public Mage(String n, int health, int mana, int level, int intelligence, int spell) {
        super(n, health, mana, level);
        this.intelligence = intelligence;
        this.spell = spell;
    }

    public void castSpell(String spell, Character a){
             setLevel(getLevel()+1);
            a.setHealth(a.getHealth()-10);
            System.out.println("Mage cast the spell " + spell + " on " + a.getName() + " and took their health to " + a.getHealth());
            System.out.println("Mage got a level up to level " + getLevel());

    }
    public void heal(Character a) {
        if (getMana() >= 30 && a.isAlive()) {
            int healAmount = 10;
            a.setHealth(a.getHealth()+healAmount);
            int mana = getMana() - 30;
            setMana(mana);
            System.out.println(getName() + " heals " + a.getName() + " for " + healAmount + " health.");
        } else {
            System.out.println(getName() + " does not have enough mana to heal or target is not alive.");
        }
    }

    public void attack(Character a){
        System.out.println("Mage attacks " + a.getName());
        int aHealth = a.getHealth()-7;
        System.out.println("Warrior attacked " + a.getName() + " and took down his health to: " + aHealth);
        a.setHealth(aHealth);
        setLevel(getLevel()+1);

    }
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Mana: " + getMana());
        System.out.println("Level: " + getLevel());
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Spell Power: " + spell);
        System.out.println("*****************");

    }

}
