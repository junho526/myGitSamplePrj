package w3_11_pokemongame;

import lombok.Getter;

@Getter
public class SurfPokemon extends Pokemon implements ISurfable {
    public SurfPokemon(String pokemonName, int HP, int level, String type) {
        super(pokemonName, HP, level, type);
        if (!type.equalsIgnoreCase("water")) {
            throw new IllegalArgumentException("물타입만 수영가능합니다.");
        }
    }

    @Override
    public void surf(String tgCity) {
        if (!this.getType().equalsIgnoreCase("Water")) {
            System.out.println(this.getPokemonName() + " 수영할 수 없습니다!");
            return;
        }
        System.out.println(this.getPokemonName() + "는(은)" + tgCity + "로 이동가능하다!");
    }

    @Override
    public void crossOcean(String tgCity) {
        System.out.println(this.getPokemonName() + "는(은)" + tgCity + "로 이동했다!");
    }
}
