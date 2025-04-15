package CH8;

public class TestPokemon {
    public static void main(String[] args) {
        Pokemon mypokemon1 = new Pokemon();
        mypokemon1.name = "可達鴨";
        mypokemon1.cp = 50;
        mypokemon1.hp = 50;
        mypokemon1.candy = 4;
        mypokemon1.printInfo(); // Pokemon{name='可達鴨', cp=50, hp=50, candy=50}
        mypokemon1.powerUp();
        mypokemon1.printInfo(); // Pokemon{name='可達鴨', cp=60, hp=50, candy=45}
        mypokemon1.evolve();
        mypokemon1.printInfo(); // Pokemon{name='可達鴨', cp=110, hp=50, candy=30}


        System.out.println("-------------------------------------------------");


        Pokemon mypokemon2 = new Pokemon();
        mypokemon2.name = "皮卡丘";
        mypokemon2.cp = 100;
        mypokemon2.hp = 100;
        mypokemon2.candy = 100;
        mypokemon2.printInfo(); // Pokemon{name='皮卡丘', cp=100, hp=100, candy=100}
        mypokemon2.powerUp();
        mypokemon2.printInfo(); // Pokemon{name='皮卡丘', cp=110, hp=100, candy=95}
        mypokemon2.evolve();
        mypokemon2.printInfo(); // Pokemon{name='皮卡丘', cp=160, hp=100, candy=80}
    }
}