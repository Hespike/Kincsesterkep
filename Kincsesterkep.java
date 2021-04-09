public class Kincsesterkep {

    static int terkep(int[][][] terkep) {
        int[] darabszam = new int[10];

        for (int i = 0; i < terkep.length; i++) {
            for (int j = 0;j < terkep[0].length; j++) {
                for (int k = 0; k < terkep[0][0].length; k++) {
                    darabszam[terkep[i][j][k]]++;
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < darabszam.length; i++) {
            if (darabszam[i] < min) {
                min = darabszam[i];
            }
        }

        return min;
    }

}
