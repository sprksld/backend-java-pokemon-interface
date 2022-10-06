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
    public List<String> getAttacks() {
        return attacks;
    }

    @Override
    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    @Override
    void thunderPunch(Pokemon name, Pokemon enemy) {
        int amount = 0;
        System.out.println( name.getName() + " attacks "
                            + enemy.getName() + " with thunderPunch");
        if ( name.getType().equals("water") && enemy.getType().equals("fire") ) {
            amount = 15;
        }
        if ( amount > 0 ) {
            System.out.println(enemy.getName() + " loses " +  amount + " points");
            enemy.setHp(enemy.getHp() - amount);
            System.out.println( enemy.getName() + " has " + enemy.getHp() + " left");
        }
    }
    @Override
    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println("electroBall");
    }
    @Override
    void thunder(Pokemon name, Pokemon enemy) {
        if ( enemy.getType().equals("electric") ) {
            enemy.setHp(enemy.getHp() + 10);
        } else {
            enemy.setHp(enemy.getHp() - 10);
        }
    }
    @Override
    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println("voltTackle");
    }

}
