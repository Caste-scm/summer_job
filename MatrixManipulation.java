import java.util.Arrays;
import java.util.Scanner;

public class MatrixManipulation {
    public void replaceRow(int index,int[] row){
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                int num = scanner.nextInt();
                matrix[i][j] = num;
            }
        }
        System.out.println("BEFORE:");
        for(int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        if(index >= 0 && index < matrix.length){
            if(row.length == matrix[index].length){
                matrix[index] = row;
            }
        }else{
            System.out.println("INDEX ERROR.");
        }
        System.out.println("AFTER:");
        for(int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void copyMatrix(){
        int[][] original = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                int num = scanner.nextInt();
                original[i][j] = num;
            }
        }
        int[][] copy = Arrays.copyOf(original,original.length);
        System.out.println("ORIGINAL:");
        for(int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("COPY:");
        for(int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                System.out.print(copy[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void verifyProperty(){
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                int num = scanner.nextInt();
                matrix[i][j] = num;
            }
        }
        for(int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int det1 = matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1])-matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0])+matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0]);
        System.out.println(det1);
        int[][] tras = new int[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix.length;j++){
                tras[i][j] = matrix[j][i];
            }
        }
        for(int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                System.out.print(tras[i][j] + " ");
            }
            System.out.println();
        }
        int det2 = tras[0][0]*(tras[1][1]*tras[2][2]-tras[1][2]*tras[2][1])-tras[0][1]*(tras[1][0]*tras[2][2]-tras[1][2]*tras[2][0])+tras[0][2]*(tras[1][0]*tras[2][1]-tras[1][1]*tras[2][0]);
        System.out.println(det2);
        if(det1==det2){
            System.out.println("SONO UGUALI.");
        }
    }
    public void fillSubmatrix(int startRow, int endRow, int startCol, int endCol, int valore){
        int[][] matrice = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                int num = scanner.nextInt();
                matrice[i][j] = num;
            }
        }
        System.out.println("BEFORE:");
        for(int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        if(matrice != null && matrice.length != 0) {
            if(startRow >= 0 && endRow < matrice.length && startRow <= endRow){
                if(startCol >= 0 && endCol < matrice[0].length && startCol <= endCol){
                    for (int i = startRow;i <= endRow;i++){
                        for (int j = startCol;j <= endCol;j++){
                            matrice[i][j] = valore;
                        }
                    }
                }
            }
        }
        System.out.println("AFTER:");
            for(int i = 0;i < 3;i++){
                for (int j = 0;j < 3;j++){
                    System.out.print(matrice[i][j] + " ");
                }
                System.out.println();
            }
    }
}
