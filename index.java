public class index {
    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
    int tamU = 0;

    
    for (int i = 0; i < tamA; i++) {
        boolean existe = false;

        for (int j = 0; j < tamU; j++) {
            if (u[j] == a[i]) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            u[tamU] = a[i];
            tamU++;
        }
    }
    
    for (int i = 0; i < tamB; i++) {
        boolean existe = false;

        for (int j = 0; j < tamU; j++) {
            if (u[j] == b[i]) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            u[tamU] = b[i];
            tamU++;
        }
    }

    return tamU;
}
}
