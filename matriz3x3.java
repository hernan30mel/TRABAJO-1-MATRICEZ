public class matricez {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        matriz[0][0] = 0;
        matriz[0][1] = 0;
        matriz[0][2] = 0;
        matriz[1][0] = 0;
        matriz[1][1] = 0;
        matriz[1][2] = 0;
        matriz[2][0] = 0;
        matriz[2][1] = 0;
        matriz[2][2] = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
