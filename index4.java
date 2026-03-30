public class index4 {
    public static void rotacionar(int[] v, int tam, int k) {
    if (tam == 0) return;

    k = k % tam;

    if (k < 0) {
        k = k + tam;
    }

    inverter(v, 0, k - 1);

    inverter(v, k, tam - 1);

    inverter(v, 0, tam - 1);
}

private static void inverter(int[] v, int inicio, int fim) {
    while (inicio < fim) {
        int temp = v[inicio];
        v[inicio] = v[fim];
        v[fim] = temp;
        inicio++;
        fim--;
    }
}
}
