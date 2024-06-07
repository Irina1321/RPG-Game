class Warrior extends Character {
    private int strength;
    private int armour;

    public Warrior(String n, int health, int mana, int level, int strength, int armour) {
        super(n, health, mana, level);
        this.armour =  armour;
        this.strength = strength;

    }
    public void attack(Character a){
        System.out.println("Warrior attacks " + a.getName());
        int aHealth = a.getHealth()-5;
        System.out.println("Warrior attacked " + a.getName() + " and took down his health to: " + aHealth);
        a.setHealth(aHealth);
        setLevel(getLevel()+1);

    }


    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Mana: " + getMana());
        System.out.println("Level: " + getLevel());
        System.out.println("Strength: " + strength);
        System.out.println("Armour: " + armour);
        System.out.println("*****************");

    }

}
