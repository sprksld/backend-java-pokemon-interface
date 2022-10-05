import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    public ElectricPokemon( String name, int level, int hp, String food, String sound ) {
        super( name, level, hp, food, sound );
        super.setType("electric");
    }

    List<String> attacks = Arrays.asList( "thunderPunch", "electroBall", "thunder", "voltTackle" );

    void thunderPunch(Pokemon name, Pokemon enemy) {
        int loss = 0;
        System.out.println( name.getName() + " attacks "
                            + enemy.getName() + " with "
                            + " nader te bepalen");
        if ( name.getType() == "water" && enemy.getType() == "fire" ) {
            loss = 15;
        }
        if ( loss > 0 ) {
            System.out.println(enemy.getName() + " loses " +  loss + " points");
            enemy.setHp(enemy.getHp() - loss);
            System.out.println( enemy.getName() + " has " + enemy.getHp() + " left");
        }

    }
    void electroBall(Pokemon name, Pokemon enemy);
    void thunder(Pokemon name, Pokemon enemy);
    void voltTackle(Pokemon name, Pokemon enemy);

}
