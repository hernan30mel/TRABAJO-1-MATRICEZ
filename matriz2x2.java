public class matriz {
    public static void main(String[] args) {
        int[][] matriz = {{0, 0}, {0, 0}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
