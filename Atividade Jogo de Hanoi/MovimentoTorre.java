public class MovimentoTorre {
    Long sequencia(long t) {
        return 0 == t || 1 == t ? t : 2 * sequencia(t - 1) + 1;
    }
}