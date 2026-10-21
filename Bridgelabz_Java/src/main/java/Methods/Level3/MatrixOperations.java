/*
 Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input and display the result of the operations. Hint =>  a. Write a Method to create a random matrix taking rows and columns as parameters b. Write a Method to add two matrices c. Write a Method to subtract two matrices d. Write a Method to multiply two matrices e. Write a Method to find the transpose of a matrix f. Write a Method to find the determinant of a 2x2 matrix g. Write a Method to find the determinant of a 3x3 matrix h. Write a Method to find the inverse of a 2x2 matrix i. Write a Method to find the inverse of a 3x3 matrix j. 8 Write a Method to display a matrix
 */
package Methods.Level3;
import java.util.Scanner;

public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 9) + 1;
            }
        }

        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%5d", value);
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    public static double determinant2x2(int[][] m) {
        return (double) m[0][0] * m[1][1]
                - (double) m[0][1] * m[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static double determinant3x3(int[][] m) {
        return (double) m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - (double) m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + (double) m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] m) {
        double det = determinant2x2(m);

        if (det == 0) {
            return null;
        }

        double[][] inverse = new double[2][2];

        inverse[0][0] = m[1][1] / det;
        inverse[0][1] = -m[0][1] / det;
        inverse[1][0] = -m[1][0] / det;
        inverse[1][1] = m[0][0] / det;

        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] m) {
        double det = determinant3x3(m);

        if (det == 0) {
            return null;
        }

        double[][] inverse = new double[3][3];

        inverse[0][0] = (double) (m[1][1] * m[2][2] - m[1][2] * m[2][1]) / det;
        inverse[0][1] = (double) (m[0][2] * m[2][1] - m[0][1] * m[2][2]) / det;
        inverse[0][2] = (double) (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / det;

        inverse[1][0] = (double) (m[1][2] * m[2][0] - m[1][0] * m[2][2]) / det;
        inverse[1][1] = (double) (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / det;
        inverse[1][2] = (double) (m[0][2] * m[1][0] - m[0][0] * m[1][2]) / det;

        inverse[2][0] = (double) (m[1][0] * m[2][1] - m[1][1] * m[2][0]) / det;
        inverse[2][1] = (double) (m[0][1] * m[2][0] - m[0][0] * m[2][1]) / det;
        inverse[2][2] = (double) (m[0][0] * m[1][1] - m[0][1] * m[1][0]) / det;

        return inverse;
    }

    // Method to display a matrix containing decimal values
    public static void displayDoubleMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%10.3f", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows for matrix A: ");
        int rowsA = sc.nextInt();

        System.out.print("Enter columns for matrix A: ");
        int colsA = sc.nextInt();

        System.out.print("Enter rows for matrix B: ");
        int rowsB = sc.nextInt();

        System.out.print("Enter columns for matrix B: ");
        int colsB = sc.nextInt();

        if (rowsA <= 0 || colsA <= 0 || rowsB <= 0 || colsB <= 0) {
            System.out.println("Rows and columns must be positive.");
            sc.close();
            return;
        }

        int[][] a = createMatrix(rowsA, colsA);
        int[][] b = createMatrix(rowsB, colsB);

        System.out.println("\nMatrix A:");
        displayMatrix(a);

        System.out.println("\nMatrix B:");
        displayMatrix(b);

        // Addition and subtraction require equal dimensions
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("\nAddition (A + B):");
            displayMatrix(addMatrices(a, b));

            System.out.println("\nSubtraction (A - B):");
            displayMatrix(subtractMatrices(a, b));
        } else {
            System.out.println("\nAddition and subtraction are not possible.");
            System.out.println("Both matrices must have the same dimensions.");
        }

        // Multiplication requires columns of A = rows of B
        if (colsA == rowsB) {
            System.out.println("\nMultiplication (A x B):");
            displayMatrix(multiplyMatrices(a, b));
        } else {
            System.out.println("\nMultiplication A x B is not possible.");
        }

        System.out.println("\nTranspose of Matrix A:");
        displayMatrix(transposeMatrix(a));

        // Determinant and inverse operations for square matrices
        if (rowsA == colsA) {
            if (rowsA == 2) {
                double det = determinant2x2(a);
                System.out.println("\nDeterminant of A: " + det);

                double[][] inverse = inverse2x2(a);

                if (inverse != null) {
                    System.out.println("\nInverse of A:");
                    displayDoubleMatrix(inverse);
                } else {
                    System.out.println("Inverse does not exist because determinant is zero.");
                }
            } else if (rowsA == 3) {
                double det = determinant3x3(a);
                System.out.println("\nDeterminant of A: " + det);

                double[][] inverse = inverse3x3(a);

                if (inverse != null) {
                    System.out.println("\nInverse of A:");
                    displayDoubleMatrix(inverse);
                } else {
                    System.out.println("Inverse does not exist because determinant is zero.");
                }
            } else {
                System.out.println("\nDeterminant and inverse are implemented for 2x2 and 3x3 matrices only.");
            }
        } else {
            System.out.println("\nDeterminant and inverse require a square matrix.");
        }

        sc.close();
    }
}

