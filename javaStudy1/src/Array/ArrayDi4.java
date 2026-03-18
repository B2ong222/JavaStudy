package Array;

import java.util.Arrays;

public class ArrayDi4 {
    static void main() {
        int[][] arr = new int[5][5];

        // 2번째 인덱스 행의 모든 열에 1을 할당
        for (int i = 0; i < arr[2].length; i++) {
            arr[2][i] = 1;
        }

        // 전체 배열 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
