import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private final String food;
    private final String sound;

    private List<String> attacks = Arrays.asList( "leafStorm", "leechSeed", "solarBeam", "leaveBlade" );

    public GrassPokemon( String name, int level, int hp, String food, String sound ) {
        super( name, level, hp, "grass" );
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
        if (enemy.getType().equals("electric")) {
            amount = 40;
        } else if (enemy.getType().equals("fire")) {
            amount = 30;
        } else if (enemy.getType().equals("water")) {
            amount = 20;
        } else if (enemy.getType().equals("grass")) {
            amount = 5;
        }
        enemy.setHp( enemy.getHp() - amount );
        System.out.println(enemy.getName() + " loses " +  amount + " points");
    }

    @Override
    public void leafStorm(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "leaveBlade" );
        drainHp( name, enemy );
        printHpLeft(enemy);
    }
    @Override
    public void solarBeam(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "leaveBlade" );
        drainHp( name, enemy );
        printHpLeft(enemy);
    }
    @Override
    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println( name.getName() + " attacks "
                + enemy.getName() + " with leechSeed");
        int amount = 15;
        name.setHp(name.getHp() + amount);
        enemy.setHp(enemy.getHp() - amount);
        System.out.println( name.getName() + " drained " + amount + " hp from " + enemy.getName());
        printHpLeft(enemy);
    }
    @Override
    public void leaveBlade(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "leaveBlade" );
        drainHp( name, enemy );
        printHpLeft(enemy);
    }

}
