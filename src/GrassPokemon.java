import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    public GrassPokemon( String name, int level, int hp, String food, String sound ) {
        super( name, level, hp, food, sound );
        super.setType("grass");
    }

    List<String> attacks = Arrays.asList( "leafStorm", "leechSeed", "solarBeam", "leaveBlade" );

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println("hoi");
    }
    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println("hoi");
    }
    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println("hoi");
    }
    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println("hoi");
    }

}
