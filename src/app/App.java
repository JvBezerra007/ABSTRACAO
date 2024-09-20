package app;

import model.Cachorro;
import model.Gato;

public class App {

    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setNome("Garfield");

        gato.emitirSom();
        gato.ColocarDormir();

        System.out.println();

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Marrom");

        cachorro.emitirSom();
        cachorro.ColocarDormir();
    }
    
}
