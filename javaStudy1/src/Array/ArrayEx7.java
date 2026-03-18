package Array;

public class ArrayEx7 {
    static void main() {
        int[][] nestedLoop = new int[5][5];

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (j == 2){
                    nestedLoop[i][j] = 1;
                } else {
                    nestedLoop[i][j] = 0;
                }
            }
        }
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(nestedLoop[row][col] + " ");
            }
            System.out.println();
        }
    }
}
