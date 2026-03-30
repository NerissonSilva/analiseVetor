public class index3 {
    public static int gerarvetorsemrepeticao(int[] v, int tamV, int[] vsr) {
    int tamVSR = 0;

    for (int i = 0; i < tamV; i++) {
        boolean existe = false;

        for (int j = 0; j < tamVSR; j++) {
            if (vsr[j] == v[i]) {
                existe = true;
                break;
            }
        }
        
        if (!existe) {
            vsr[tamVSR] = v[i];
            tamVSR++;
        }
    }

    return tamVSR;
}
}
