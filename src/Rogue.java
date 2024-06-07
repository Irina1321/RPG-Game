public class Rogue extends Character{

    private int agility;
    private int dexterity;
    public Rogue(String n, int health, int mana, int level, int agility, int dexterity) {
        super(n, health, mana, level);
        this.agility = agility;
        this.dexterity = dexterity;
    }
    public void attack(Character a){
        System.out.println("Rogue attacks " + a.getName());
        int aHealth = a.getHealth()-4;
        System.out.println("Rogue attacked " + a.getName() + " and took down his health to: " + aHealth);
        a.setHealth(aHealth);
        setLevel(getLevel()+1);

    }
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Mana: " + getMana());
        System.out.println("Level: " + getLevel());
        System.out.println("Agility: " + agility);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("*****************");

    }

}
