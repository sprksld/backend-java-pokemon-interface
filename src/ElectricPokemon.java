import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private final String type;
    private final String food;
    private final String sound;


    public ElectricPokemon( String name, int level, int hp, String food, String sound ) {
        super( name, level, hp, food, sound );
        super.setType("electric");
        this.type = "electric";
        this.food = food;
        this.sound = sound;
    }

    List<String> attacks = Arrays.asList( "thunderPunch", "electroBall", "thunder", "voltTackle" );

    void thunderPunch(Pokemon name, Pokemon enemy) {
        int loss = 0;
        System.out.println( name.getName() + " attacks "
                            + enemy.getName() + " with thunderPunch");
        if ( name.getType().equals("water") && enemy.getType().equals("fire") ) {
            loss = 15;
        }
        if ( loss > 0 ) {
            System.out.println(enemy.getName() + " loses " +  loss + " points");
            enemy.setHp(enemy.getHp() - loss);
            System.out.println( enemy.getName() + " has " + enemy.getHp() + " left");
        }

    }
    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println("electricBall");
    }
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
