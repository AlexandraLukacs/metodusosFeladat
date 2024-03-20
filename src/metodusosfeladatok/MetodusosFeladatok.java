package metodusosfeladatok;

import java.util.Random;


public class MetodusosFeladatok {

    
    
    public static void main(String[] args) {
        matrixOsszeadasa();
    }

    private static void matrixOsszeadasa() {
        int[][]matrixA = feltolt(3,2);
        matrixKiir("\'A\' mátrix: ", matrixA);
        int[][]matrixB = feltolt(3,2);
        matrixKiir("\'B\' mátrix: ",matrixB);
        
        int[][] osszeg = osszeadas(matrixA, matrixB);
        matrixKiir("\'A\' + \'B\' mátrix: ",osszeg);
    }

    private static int[][] feltolt(int sor, int oszlop) {
        int[][] matrix = new int [sor][oszlop];
        int also = -15;
        int felso = 25;
        int db = felso - also + 1;
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                matrix[i][j] = (int)(Math.random()*db)+also;
            }
        }
        return matrix;
    }

    private static void matrixKiir(String cim, int[][] matrix) {
        int sor = matrix.length;
        System.out.println(cim);
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println(" ");
        }
    }

    private static int[][] osszeadas(int[][] matrixA, int[][] matrixB) {
        int sor = matrixA.length;
        int oszlop = matrixA[0].length;
        int[][] matrix = new int[sor][oszlop];
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                matrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrix;
    }

    
    
}
