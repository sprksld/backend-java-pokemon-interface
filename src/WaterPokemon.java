import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private final String type;
    private final String food;
    private final String sound;


    public WaterPokemon( String name, int level, int hp, String food, String sound ) {
        super( name, level, hp, food, sound );
        super.setType("water");
        this.type = "water";
        this.food = food;
        this.sound = sound;
    }

    List<String> attacks = Arrays.asList( "surf", "hydroPump", "hydroCanon", "rainDance" );


    void surf(Pokemon name, Pokemon enemy) {
        System.out.println("whaatup");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println("johoo");
    }
    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println("Jihaa");
    }
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
