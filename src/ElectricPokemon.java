import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private final String food;
    private final String sound;

    private List<String> attacks = Arrays.asList( "thunderPunch", "electroBall", "thunder", "voltTackle" );

    public ElectricPokemon( String name, int level, int hp, String food, String sound ) {
        super( name, level, hp, "electric" );
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
        return this.attacks;
    }

    @Override
    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }
    public void drainHp( Pokemon name, Pokemon enemy) {
        int amount = 0;
        if (enemy.getType().equals("water")) {
            amount = 40;
        } else if (enemy.getType().equals("grass")) {
            amount = 30;
        } else if (enemy.getType().equals("fire")) {
            amount = 20;
        } else if (enemy.getType().equals("electric")) {
            amount = 5;
        }
        enemy.setHp( enemy.getHp() - amount );
        System.out.println(enemy.getName() + " loses " +  amount + " points");
    }

    @Override
    void thunderPunch(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "thunderPunch" );
        drainHp( name, enemy );
        printHpLeft( enemy );
    }
    @Override
    void electroBall(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "electroBall" );
        drainHp( name, enemy );
        printHpLeft( enemy );
    }
    @Override
    void thunder(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "thunder" );
        drainHp( name, enemy );
        printHpLeft( enemy );
    }
    @Override
    void voltTackle(Pokemon name, Pokemon enemy) {
        attackInfo( name, enemy, "voltTackle" );
        drainHp( name, enemy );
        printHpLeft( enemy );
    }

}
