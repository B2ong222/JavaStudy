package Array;

public class ArrayEx8 {
    static void main() {
        int[][] nestedLoop = new int[9][9];

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                nestedLoop[i][j] = (i+1)*(j+1);
            }
        }
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(nestedLoop[row][col] + " ");
            }
            System.out.println();
        }
    }
}
