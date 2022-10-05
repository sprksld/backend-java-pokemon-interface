import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private final String type;
    private final String food;
    private final String sound;


    public FirePokemon( String name, int level, int hp, String food, String sound ) {
        super( name, level, hp, food, sound );
        super.setType("fire");
        this.type = "fire";
        this.food = food;
        this.sound = sound;
    }

    List<String> attacks = Arrays.asList( "fireLash", "flameThrower", "pyroBall", "inferno" );

    @Override
    public String getType() {
        return this.type;
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println("fireLash");
    }
    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println("flameThrower");
    }
    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println("pyroBall");
    }
    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println("inferno");
    }

}
