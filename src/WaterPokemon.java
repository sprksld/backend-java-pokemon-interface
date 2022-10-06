import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private final String food;
    private final String sound;

    private List<String> attacks = Arrays.asList( "surf", "hydroPump", "hydroCanon", "rainDance" );

    public WaterPokemon( String name, int level, int hp, String food, String sound ) {
        super( name, level, hp, "water" );
        this.food = food;
        this.sound = sound;
    }

    @Override
    public String getFood() {
        return this.food;
    }

    @Override
    public String getSound() {
        return this.sound;
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    @Override
    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    public void drainHp( Pokemon name, Pokemon enemy) {
        int amount = 0;
        if (enemy.getType().equals("fire")) {
            amount = 40;
        } else if (enemy.getType().equals("electric")) {
            amount = 30;
        } else if (enemy.getType().equals("grass")) {
            amount = 20;
        } else if (enemy.getType().equals("water")) {
            amount = 5;
        }
        enemy.setHp( enemy.getHp() - amount );
        System.out.println(enemy.getName() + " loses " +  amount + " points");
    }

    @Override
    void surf(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "surf" );
        drainHp( name, enemy );
        printHpLeft( enemy );
    }
    @Override
    void hydroPump(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "hydroPump" );
        drainHp( name, enemy );
        printHpLeft( enemy );
    }
    @Override
    void hydroCanon(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "hydroCanon" );
        drainHp( name, enemy );
        printHpLeft( enemy );
    }
    @Override
    void rainDance(Pokemon name, Pokemon enemy) {
        if ( enemy.getType().equals("electric") ) {
            System.out.println("has no effect on " + enemy.getName());
        } else if ( enemy.getType().equals("grass") ) {
            enemy.setHp(enemy.getHp() + 10);
        } else {
            enemy.setHp(enemy.getHp() - 10);
        }
    }

}
