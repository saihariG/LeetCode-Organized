package Matrix;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {

        int m = matrix.length , n = matrix[0].length;
        int[][] transposeMatrix = new int[n][m];

        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {

                transposeMatrix[j][i] = matrix[i][j];

            }
        }

        return transposeMatrix;
    }
}
