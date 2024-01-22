package logic;

public class App {
    public static void main(String[] args) throws Exception {

        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();

        squirtle.atacarAraniazo();
        squirtle.atacarBurbuja();
        charmander.atacarMordisco();
        charmander.atacarAscuas();
        pikachu.atacarPlacaje();
        pikachu.atacarImpactrueno();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarParalizar();

    }
}
