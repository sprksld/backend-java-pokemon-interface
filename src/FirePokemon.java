import com.sun.nio.file.SensitivityWatchEventModifier;

import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private final String food;
    private final String sound;

    private List<String> attacks = Arrays.asList( "fireLash", "flameThrower", "pyroBall", "inferno" );

    public FirePokemon( String name, int level, int hp, String food, String sound ) {
        super( name, level, hp, "fire" );
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
        if (enemy.getType().equals("grass")) {
            amount = 40;
        } else if (enemy.getType().equals("water")) {
            amount = 30;
        } else if (enemy.getType().equals("electric")) {
            amount = 20;
        } else if (enemy.getType().equals("fire")) {
            amount = 5;
        }
        enemy.setHp( enemy.getHp() - amount );
        System.out.println(enemy.getName() + " loses " +  amount + " points");
    }

    @Override
    void inferno(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "inferno" );
        drainHp( name, enemy );
        printHpLeft( enemy );
    }
    @Override
    void pyroBall(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "pyroBall" );
        drainHp( name, enemy );
        printHpLeft( enemy );
    }
    @Override
    void fireLash(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "fireLash" );
        drainHp( name, enemy );
        printHpLeft( enemy );
    }
    @Override
    void flameThrower(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "flameThrower" );
        drainHp( name, enemy );
        printHpLeft( enemy );
    }

}
