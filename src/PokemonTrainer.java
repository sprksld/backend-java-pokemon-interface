import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {
    private String name;

    private List<Pokemon> pokemons = new ArrayList<>();


    private WaterPokemon blastoise = new WaterPokemon();
    private WaterPokemon gyarados = new WaterPokemon();
    private FirePokemon charizard = new FirePokemon();
    private GrassPokemon ditto = new GrassPokemon();
    private ElectricPokemon raichu = new ElectricPokemon();
    private GrassPokemon venusaur = new GrassPokemon();

    public PokemonTrainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public Pokemon getBlastoise() {
        return blastoise;
    }

    public void setBlastoise(Pokemon blastoise) {
        this.blastoise = (WaterPokemon) blastoise;
    }

    public Pokemon getGyarados() {
        return gyarados;
    }

    public void setGyarados(Pokemon gyarados) {
        this.gyarados = (WaterPokemon) gyarados;
    }

    public Pokemon getCharizard() {
        return charizard;
    }

    public void setCharizard(Pokemon charizard) {
        this.charizard = (FirePokemon) charizard;
    }

    public Pokemon getDitto() {
        return ditto;
    }

    public void setDitto(Pokemon ditto) {
        this.ditto = (GrassPokemon) ditto;
    }

    public Pokemon getRaichu() {
        return raichu;
    }

    public void setRaichu(Pokemon raichu) {
        this.raichu = (ElectricPokemon) raichu;
    }

    public Pokemon getVenusaur() {
        return venusaur;
    }

    public void setVenusaur(Pokemon venusaur) {
        this.venusaur = (GrassPokemon) venusaur;
    }

    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }


}
