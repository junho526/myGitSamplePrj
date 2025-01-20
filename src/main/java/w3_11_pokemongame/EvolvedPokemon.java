package w3_11_pokemongame;

import lombok.Getter;

@Getter
public class EvolvedPokemon extends Pokemon {
    private int evolutionStage;

    public EvolvedPokemon(String pokemonName, int HP, int level, int evolutionStage, String type) {

        super(pokemonName, HP, level, type);
        this.evolutionStage = evolutionStage;
    }

    @Override
    public String toString() {
        return super.toString() + " (진화단계: " + evolutionStage + ")";
    }
}



