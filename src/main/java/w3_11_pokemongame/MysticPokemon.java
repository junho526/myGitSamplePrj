package w3_11_pokemongame;

import lombok.Getter;

@Getter
public class MysticPokemon extends Pokemon {
    public MysticPokemon(String pokemonName, int HP, int level, String type) {
        super(pokemonName, HP, level, type);
    }
}
