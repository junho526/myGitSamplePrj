package w3_11_pokemongame;

import lombok.Getter;

@Getter
public class FlyPokemon extends Pokemon implements IFlyable {

    public FlyPokemon(String pokemonName, int HP, int level, String type) {
        super(pokemonName, HP, level, type);
        if (!type.equalsIgnoreCase("sky")) {
            throw new IllegalArgumentException("비행타입만 비행가능합니다.");
        }
    }

    @Override
    public void fly(String tgCity) {
        if (!this.getType().equalsIgnoreCase("sky")) {
            System.out.println(this.getPokemonName() + "날 수 없습니다");
            return;
        }
        System.out.println(this.getPokemonName() + "는(은)" + tgCity + "로 이동가능하다!");
    }

    @Override
    public void crossOcean(String tgCity) {

        System.out.println(this.getPokemonName() + " 는(은) " + tgCity + "로 이동했다!");
    }
}