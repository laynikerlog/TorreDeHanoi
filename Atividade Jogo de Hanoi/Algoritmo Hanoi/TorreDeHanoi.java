public class TorreDeHanoi {

    static long movimentos = 0;

    public static void main(String[] args) {
        torreDeHanoi(3, 'A', 'C', 'B');
        System.out.println("Total de movimentos: " + movimentos);
    }

    static void torreDeHanoi(long n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            movimentos++;
        } else {
            torreDeHanoi(n - 1, origem, auxiliar, destino);
            System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
            movimentos++;
            torreDeHanoi(n - 1, auxiliar, destino, origem);
        }
    }
}
