import java.util.Arrays;
import java.util.List;

public abstract class Pokemon {
    private String type;
    private String name;

    int level;
    int hp;
    private String food;
    private String sound;

    private List<String> attacks;

    void surf(Pokemon name, Pokemon enemy) {}

    void fireLash(Pokemon name, Pokemon enemy) {}

    void leafStorm(Pokemon name, Pokemon enemy) {}

    void hydroPump(Pokemon name, Pokemon enemy) {}

    void thunderPunch(Pokemon name, Pokemon enemy) {}

    void electroBall(Pokemon name, Pokemon enemy) {}

    void solarBeam(Pokemon name, Pokemon enemy) {}

    void flameThrower(Pokemon name, Pokemon enemy) {}

    void hydroCanon(Pokemon name, Pokemon enemy) {}

    void pyroBall(Pokemon name, Pokemon enemy) {}

    void thunder(Pokemon name, Pokemon enemy) {}

    void rainDance(Pokemon name, Pokemon enemy) {}

    void leechSeed(Pokemon name, Pokemon enemy) {}

    void leaveBlade(Pokemon name, Pokemon enemy) {}

    void inferno(Pokemon name, Pokemon enemy) {}

    void voltTackle(Pokemon name, Pokemon enemy) {}

    public Pokemon(String name, int level, int hp, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {}

    public void getPokemonList() {

    }
}

