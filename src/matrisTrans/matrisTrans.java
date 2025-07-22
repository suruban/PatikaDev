package matrisTrans;

public class matrisTrans {

    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Orijinal Matris:");
        printMatris(matris);

        int[][] transpoz = calcTrans(matris);

        System.out.println("Transpoz Matris:");
        printMatris(transpoz);
    }

    // Transpoz hesaplayan metot
    public static int[][] calcTrans(int[][] matris) {
        int satir = matris.length;
        int sutun = matris[0].length;

        int[][] transpoz = new int[sutun][satir];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        return transpoz;
    }

    // Matris yazdıran yardımcı metot
    public static void printMatris(int[][] matris) {
        for (int[] satir : matris) {
            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
    }
}
