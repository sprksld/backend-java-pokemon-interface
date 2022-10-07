import java.util.Arrays;
import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    private String name;

    public PokemonGymOwner(String name) {
        super(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }

}
