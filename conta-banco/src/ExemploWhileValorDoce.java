import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhileValorDoce {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if(valorDoce> mesada)
            valorDoce = mesada;
            System.out.println("Valor do doce = R$ " + valorDoce + ".  Doce adicionado ao carrinho.");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
