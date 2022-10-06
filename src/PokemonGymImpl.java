import java.util.*;

public class PokemonGymImpl implements PokemonGym {

    public void enteredTheGym(PokemonTrainer player1) {
        PokemonGymOwner gymOwner = new PokemonGymOwner("Brock");
        List<Pokemon> names = new ArrayList<>();
        names.add(gymOwner.getBlastoise());
        names.add(gymOwner.getGyarados());
        names.add(gymOwner.getCharizard());
        names.add(gymOwner.getDitto());
        names.add(gymOwner.getRaichu());
        names.add(gymOwner.getVenusaur());
        gymOwner.setPokemons(names);
        System.out.println("You have entered the gym");
        System.out.println("In front of you stands a pokemontrainer");
        System.out.println(gymOwner.getName() + ": Hello stranger, I'm " + gymOwner.getName() + ", the owner of this gym. Who are you?");
        System.out.println("I'm " + player1.getName() + " and i'm here to challenge you for a battle");
        System.out.println("So you're after my badge too, lets fight!!!");

        Pokemon gymPokemon = chooseGymPokemon(gymOwner);
        System.out.println(gymOwner.getName() + ": I'll choose you, " + gymPokemon.getName());
        Pokemon pokemon = choosePokemon(player1);
        System.out.println(player1.getName() + ": I'll choose you, " + pokemon.getName());

        fightRound(player1, gymOwner, pokemon, gymPokemon);

    }

    public void printPokemon(List<Pokemon> pokemons) {
        for (Pokemon p : pokemons) {
            System.out.println(p.getName());
        }
    }

    public Pokemon selectPokemon(String pokemon, PokemonTrainer trainer) {
        List<Pokemon> pokemons = trainer.getPokemons();
        int number = 0;
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getName().equalsIgnoreCase(pokemon)) {
                number = i;
            }
        }
        return pokemons.get(number);
    }

    public void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon) {
        Scanner speler_A = new Scanner(System.in);
        while (pokemon.getHp() > 0 && gymPokemon.getHp() > 0) {

            System.out.println("It's " + owner.getName() + "'s turn to attack");
            gymOwnerAttacks(gymPokemon, pokemon);
            System.out.println("It's " + trainer.getName() + "'s turn to attack");
            attackOrChange(pokemon, gymPokemon, trainer, owner);

        }
        if (pokemon.getHp() <= 0) {
            System.out.println(gymPokemon.getName() + " has defeated " + pokemon.getName());
        } else if (gymPokemon.getHp() <= 0) {
            System.out.println(pokemon.getName() + " has defeated " + gymPokemon.getName());
        }

        System.out.println("Would you like to keep playing? yes or no");
        String keepPlaying = speler_A.nextLine();
        if (keepPlaying.equals("yes")) {
            enteredTheGym(trainer);
        } else {
            System.out.println("Thank you for playing");
        }
    }

    public Pokemon chooseGymPokemon(PokemonGymOwner gymOwner) {
        Random rand = new Random();
        List<Pokemon> pokemons = new ArrayList<>();
        for (Pokemon p : gymOwner.getPokemons()) {
            if (p.getHp() > 0) {
                pokemons.add(p);
            }
        }
        int amountOfPokemons = pokemons.size();
        int randomNumber = rand.nextInt(amountOfPokemons);
        return pokemons.get(randomNumber);
    }

    public Pokemon choosePokemon(PokemonTrainer trainer) {
        Scanner speler_A = new Scanner(System.in);
        List<Pokemon> pokemons = new ArrayList<>();
        for (Pokemon p : trainer.getPokemons()) {
            if (p.getHp() > 0) {
                pokemons.add(p);
            }
        }
        System.out.println("Please make your choice of pokemon to attack");
        for (Pokemon p : pokemons) {
            System.out.println(p.getName());
        }
        String pokemon = speler_A.nextLine();
        return selectPokemon(pokemon, trainer);
    }

    public int randomAttackByGymOwner() {
        Random rand = new Random();
        int maxAttacks = 4;
        return rand.nextInt(maxAttacks);
    }

    public String chooseAttackPlayer(Pokemon p) {
        Scanner speler_A = new Scanner(System.in);
        String type = p.getType();
        switch (type) {
            case "fire":
                FirePokemon fp = (FirePokemon) p;
                System.out.println("Choose your attack");
                System.out.println(fp.getAttacks());
                return speler_A.nextLine();

            case "water":
                WaterPokemon wp = (WaterPokemon) p;
                System.out.println("Choose your attack");
                System.out.println(wp.getAttacks());
                return speler_A.nextLine();

            case "electric":
                ElectricPokemon ep = (ElectricPokemon) p;
                System.out.println("Choose your attack");
                System.out.println(ep.getAttacks());
                return speler_A.nextLine();

            default:
                GrassPokemon gp = (GrassPokemon) p;
                System.out.println("Choose your attack");
                System.out.println(gp.getAttacks());
                return speler_A.nextLine();
        }
    }

    public void performAttackPlayer(Pokemon pokemon, Pokemon gymPokemon, String attack) {
        FirePokemon fire;
        ElectricPokemon electric;
        GrassPokemon grass;
        WaterPokemon water;

        String choosenAttack = attack.toLowerCase(Locale.ROOT);

        switch (pokemon.getType()) {
            case "fire":
                fire = new FirePokemon(pokemon.getName(), pokemon.getLevel(), pokemon.getHp(), pokemon.getFood(), pokemon.getSound());
                switch (choosenAttack) {
                    case "inferno":
                        fire.inferno(pokemon, gymPokemon);
                        break;
                    case "pyroball":
                        fire.pyroBall(pokemon, gymPokemon);
                        break;
                    case "firelash":
                        fire.fireLash(pokemon, gymPokemon);
                        break;
                    default:
                        fire.flameThrower(pokemon, gymPokemon);
                        break;
                }
                break;

            case "water":
                water = new WaterPokemon(pokemon.getName(), pokemon.getLevel(), pokemon.getHp(), pokemon.getFood(), pokemon.getSound());
                switch (choosenAttack) {
                    case "surf":
                        water.surf(pokemon, gymPokemon);
                        break;
                    case "hydropump":
                        water.hydroPump(pokemon, gymPokemon);
                        break;
                    case "hydrocanon":
                        water.hydroCanon(pokemon, gymPokemon);
                        break;
                    default:
                        water.rainDance(pokemon, gymPokemon);
                        break;
                }
                break;

            case "grass":
                grass = new GrassPokemon(pokemon.getName(), pokemon.getLevel(), pokemon.getHp(), pokemon.getFood(), pokemon.getSound());
                switch (choosenAttack) {
                    case "leafstorm":
                        grass.leafStorm(pokemon, gymPokemon);
                        break;
                    case "solarbeam":
                        grass.solarBeam(pokemon, gymPokemon);
                        break;
                    case "leechseed":
                        grass.leechSeed(pokemon, gymPokemon);
                        break;
                    default:
                        grass.leaveBlade(pokemon, gymPokemon);
                        break;
                }
            default:
                electric = new ElectricPokemon(pokemon.getName(), pokemon.getLevel(), pokemon.getHp(), pokemon.getFood(), pokemon.getSound());
                switch (choosenAttack) {
                    case "thunderpunch":
                        electric.thunderPunch(pokemon, gymPokemon);
                        break;
                    case "electroball":
                        electric.electroBall(pokemon, gymPokemon);
                        break;
                    case "thunder":
                        electric.thunder(pokemon, gymPokemon);
                        break;
                    default:
                        electric.voltTackle(pokemon, gymPokemon);
                        break;
                }
                break;
        }
    }

    public void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon) {
        FirePokemon fire;
        ElectricPokemon electric;
        GrassPokemon grass;
        WaterPokemon water;

        String attack;

        switch (gymPokemon.getType()) {
            case "fire":
                fire = new FirePokemon(gymPokemon.getName(), gymPokemon.getLevel(), gymPokemon.getHp(), gymPokemon.getFood(), gymPokemon.getSound());
                attack = fire.getAttacks().get(randomAttackByGymOwner());
                switch (attack) {
                    case "inferno": fire.inferno(gymPokemon, pokemon); break;
                    case "pyroBall": fire.pyroBall(gymPokemon, pokemon); break;
                    case "fireLash": fire.fireLash(gymPokemon, pokemon); break;
                    default: fire.flameThrower(gymPokemon, pokemon); break;
                }
                break;

            case "water":
                water = new WaterPokemon(gymPokemon.getName(), gymPokemon.getLevel(), gymPokemon.getHp(), gymPokemon.getFood(), gymPokemon.getSound());
                attack = water.getAttacks().get(randomAttackByGymOwner());
                switch (attack) {
                    case "surf": water.surf(gymPokemon, pokemon); break;
                    case "hydroPump": water.hydroPump(gymPokemon, pokemon); break;
                    case "hydroCanon": water.hydroCanon(gymPokemon, pokemon); break;
                    default: water.rainDance(gymPokemon, pokemon); break;
                }
                break;

            case "grass":
                grass = new GrassPokemon(gymPokemon.getName(), gymPokemon.getLevel(), gymPokemon.getHp(), gymPokemon.getFood(), gymPokemon.getSound());
                attack = grass.getAttacks().get(randomAttackByGymOwner());
                switch (attack) {
                    case "leafStorm": grass.leafStorm(gymPokemon, pokemon); break;
                    case "solarBeam": grass.solarBeam(gymPokemon, pokemon); break;
                    case "leechSeed": grass.leechSeed(gymPokemon, pokemon); break;
                    default: grass.leaveBlade(gymPokemon, pokemon); break;
                }
                break;

            default:
                electric = new ElectricPokemon(gymPokemon.getName(), gymPokemon.getLevel(), gymPokemon.getHp(), gymPokemon.getFood(), gymPokemon.getSound());
                attack = electric.getAttacks().get(randomAttackByGymOwner());
                switch (attack) {
                    case "thunderPunch": electric.thunderPunch(gymPokemon, pokemon); break;
                    case "electroBall": electric.electroBall(gymPokemon, pokemon); break;
                    case "thunder": electric.thunder(gymPokemon, pokemon); break;
                    default: electric.voltTackle(gymPokemon, pokemon); break;
                }
                break;

        }
    }

    public void attackOrChange(Pokemon pokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner gym) {
        Scanner speler_A = new Scanner(System.in);

        System.out.println("Do you want to attack or change your pokemon?");
        System.out.println("Type a for attack or c for change");
        String choice = speler_A.nextLine();

        if (choice.equalsIgnoreCase("a")) {
            String attack = chooseAttackPlayer(pokemon);
            performAttackPlayer(pokemon, gymPokemon, attack);
        } else {
            pokemon = choosePokemon(trainer);
            attackOrChange(pokemon, gymPokemon, trainer, gym);
            fightRound(trainer, gym, pokemon, gymPokemon);
        }
    }

}
