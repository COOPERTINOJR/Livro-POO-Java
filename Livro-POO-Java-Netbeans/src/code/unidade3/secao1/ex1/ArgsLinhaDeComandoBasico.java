package code.unidade3.secao1.ex1;

/**
 *
 * @author Jesimar S. Arantes
 */
public class ArgsLinhaDeComandoBasico {
    public static void main(String[] args) {
        System.out.printf("quantidade de argumentos = %d%n", args.length);
        for (int i = 0; i < args.length; i++){
            System.out.printf("argumento[%d] = %s%n", i, args[i]);
        }
    }
}
