package code.unidade3.secao2.ex3;

import static code.unidade3.secao2.ex3.Direcao.*;

/**
 *
 * @author jesimar
 */
public class Main {
    public static void main(String[] args) {
        CarroRF carro = new CarroRF();
        System.out.println(carro);
        carro.agendarMovimentos(CIMA, DIREITA, CIMA, ESQUERDA);
        System.out.println(carro);
        carro.run();
        System.out.println(carro);
        carro.agendarMovimentos(BAIXO, ESQUERDA, ESQUERDA);
        System.out.println(carro);
        carro.run();
        System.out.println(carro);
    }
}
