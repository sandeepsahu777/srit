package sandeep;

class MatrixSum{
public static void main(String[] args) {
    int[][] matrix1 = {
        {1, 2},
        {4, 5},
    };

    int[][] matrix2 = {
        {9, 8},
        {6, 5}
    };

    int rows = matrix1.length;
    int cols = matrix1[0].length;
    int[][] sum = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            sum[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }

    for (int[] row : sum) {
        for (int element : row) {
            System.out.print(element + " ");
        }
        System.out.println();
        }

}
}