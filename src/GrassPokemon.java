import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private final String food;
    private final String sound;

    public GrassPokemon( String name, int level, int hp, String food, String sound ) {
        super( name, level, hp, "grass" );
        this.food = food;
        this.sound = sound;
    }

    List<String> attacks = Arrays.asList( "leafStorm", "leechSeed", "solarBeam", "leaveBlade" );

    @Override
    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println("leafStorm");
    }
    @Override
    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println("solarBeam");
    }
    @Override
    public void leechSeed(Pokemon name, Pokemon enemy) {
        int amount = 15;
        System.out.println( name.getName() + " attacks "
                + enemy.getName() + " with leechSeed");
        name.setHp(name.getHp() + amount);
        enemy.setHp(enemy.getHp() - amount);
    }
    @Override
    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println("leaveBlade");
    }

}
