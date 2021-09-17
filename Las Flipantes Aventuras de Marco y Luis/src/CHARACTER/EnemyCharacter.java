package CHARACTER;

public class EnemyCharacter extends AbstracCharacter {

    public EnemyCharacter(String n, int lvl, int atk, int def, int hp) {
        super(n, lvl, atk, def, hp);
    }

    @Override
    public boolean iamdead() {
        if (this.getHitpoints() == 0) {
            return true;
        } else {
            return false;
        }
    }


}



