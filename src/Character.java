public class Character {
    private String name;
    private int health;
    private int mana;
    private int level;

    public Character(String n, int h, int m, int l){
        this.name = n;
        this.health = h;
        this.mana = m;
        this.level = l;
    }

    public int getHealth(){
        return health;
    }


    public void setHealth(int updatedHealth){
        health = updatedHealth;
    }

    public String getName(){
        return name;
    }

    public int getMana(){
        return mana;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int newlevel){
        level = newlevel;
    }
    public void setMana(int newMana){
        mana = newMana;
    }


    public void attack(Character a){
        System.out.println(this.name + "attacks " + a.name);
        int aHealth = a.getHealth()-2;
        System.out.println(this.name + "attacked " + a.name + "and took down his health to: " + aHealth);
        a.setHealth(aHealth);
    }

    public int defend(){
        return mana--;
    }
    public boolean isAlive() {
        return health > 0;
    }

    public void castSpell(String spell){
        String spell1 = "crucio";
        String spell2 = "Imperio";
        String spell3 = "accio";
        if (spell.equalsIgnoreCase(spell1)){
            level += 1;
            health -= 0.5;
        } else if (spell.equalsIgnoreCase(spell2)){
            level += 1.5;
            health -= 1;
        } else if (spell.equalsIgnoreCase(spell3)){
            level += 0.5;
        } System.out.println("The health is " + health);
        System.out.println("The level is " + level);
    }
}
