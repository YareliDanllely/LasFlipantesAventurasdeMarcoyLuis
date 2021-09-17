package CHARACTER;

public abstract class AbstracCharacter {
    private int level;
    private int damage;
    private int defence;
    private int hitpoints;

    public AbstracCharacter(int lvl, int atk, int def, int hp) {
        this.level=lvl;
        this.damage=atk;
        this.defence=def;
        this.hitpoints=hp;
    }

    public abstract boolean iamdead();

    public int getLevel() {return level;}

    public int getDamage() {return damage;}

    public int getDefence() {return defence;}

    public int getHitpoints() {return hitpoints;}

    public void setLevel(int level) {this.level = level;}

    public void setDamage(int damage) {this.damage = damage;}

    public void setDefence(int defence) {this.defence = defence;}

    public void setHitpoints(int hitpoints) {this.hitpoints = hitpoints;}

}

