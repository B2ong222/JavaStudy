package Array;

public class ArrayEx9 {
    static void main() {
        int[][] score = {
                {85, 70, 90, 95},
                {80, 95, 90, 75},
                {75, 85, 90, 80}
        };

        int[] hap = new int[3];

        for (int i = 0; i < 3; i++){
            int a = 0;
            for (int j = 0; j < 4; j++){
                a += score[i][j];
            }
            hap[i] = a/4;
        }
        for (int i = 0; i < 3; i++){
            System.out.println("평: " + hap[i]);
        }
    }
}
