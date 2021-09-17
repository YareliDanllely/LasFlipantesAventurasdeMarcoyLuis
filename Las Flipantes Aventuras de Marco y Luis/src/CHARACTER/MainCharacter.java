package CHARACTER;

public class MainCharacter extends AbstracCharacter{
      private int  attackpoints;
      private MainCharactertype type;

      public MainCharacter( MainCharactertype type, int lvl, int atk, int def, int hp, int fp ) {
        super( lvl, atk, def, hp );
        this.attackpoints=fp;
        this.type=type;
      }

      public void takeItem(Items name){
          if (name==Star){}
      }

      @Override
      public boolean iamdead() {
          if (this.getHitpoints()==0){ return true;}
          else {return false;}
      }

      public void setAttackpoints(int attackpoints) {
          this.attackpoints = attackpoints;
      }

      public int getAttackpoints() {
          return attackpoints;
      }


  }
