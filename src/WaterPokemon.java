import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    public WaterPokemon( String name, int level, int hp, String food, String sound ) {
        super( name, level, hp, food, sound );
        super.setType("water");
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
        System.out.println("no effect on " + enemy.getName());
    }

}
