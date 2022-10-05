import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private final String food;
    private final String sound;

    public FirePokemon( String name, int level, int hp, String food, String sound ) {
        super( name, level, hp, "fire" );
        this.food = food;
        this.sound = sound;
    }

    List<String> attacks = Arrays.asList( "fireLash", "flameThrower", "pyroBall", "inferno" );

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println("inferno");
    }
    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println("pyroBall");
    }
    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println("fireLash");
    }
    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println("flameThrower");
    }

}
