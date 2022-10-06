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
    public List<String> getAttacks() {
        return attacks;
    }

    @Override
    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    @Override
    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println("inferno");
    }
    @Override
    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println("pyroBall");
    }
    @Override
    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println("fireLash");
    }
    @Override
    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println("flameThrower");
    }

}
