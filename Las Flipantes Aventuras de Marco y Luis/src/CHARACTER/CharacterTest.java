package CHARACTER;
import org.junit.Assert;
import org.junit.jupiter.api.*;

public class CharacterTest {
    private MainCharacter Marco;
    private MainCharacter Luis;
    private EnemyCharacter Goomba;
    private EnemyCharacter Spiny;
    private EnemyCharacter Boo;

    @BeforeEach
    public void setUp() {
        Marco = new MainCharacter(MainCharactertype.Marco, 2, 20, 15, 0, 10);
        Luis = new MainCharacteR(MainCharactertype.Luis, 1, 15, 10, 7, 5);
        Goomba = new EnemyCharacter("Goomba", 5, 0, 30, 0);
        Spiny = new EnemyCharacter("Spiny", 8, 10, 15, 10);
        Boo = new EnemyCharacter("Boo", 1, 0, 70, 8);
    }

    @Test
    public void testConstructorMainCharacter () {
        Assertions.assertEquals(Luis, Luis);
        Assertions.assertNotEquals(Luis, Marco);
        Assertions.assertEquals(Luis.getHitpoints(),7);
        Assertions.assertEquals(Marco.getDamage(),20);
        Assertions.assertNotEquals(Luis.getDefence(),15);
    }

    @Test
    public void testConstructorEnemyCharacter (){
        Assertions.assertEquals(Goomba,Goomba);
        Assertions.assertNotEquals(Spiny, Boo);
        Assertions.assertEquals(Boo.getDefence(),70);
        Assertions.assertNotEquals(Spiny.getLevel(),10);
    }
    @Test
    public void testiamdead(){
        Assertions.assertFalse(Luis.iamdead());
        Assertions.assertTrue(Marco.iamdead());
        Assertions.assertTrue(Goomba.iamdead());


    }






}

