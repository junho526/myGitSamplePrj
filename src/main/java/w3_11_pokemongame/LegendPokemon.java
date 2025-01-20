package w3_11_pokemongame;

import lombok.Getter;

@Getter
public class LegendPokemon extends Pokemon {
    private static LegendPokemon legendPokemon;
    public LegendPokemon(String pokemonName, int HP, int level, String type) {
        super(pokemonName, HP, level, type);

    }
    public static LegendPokemon getLegendPokemon() {
        return legendPokemon;
    }
}
