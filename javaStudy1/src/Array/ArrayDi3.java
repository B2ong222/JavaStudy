package Array;

public class ArrayDi3 {
    static void main() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(arr.length);    // 행의 길이 (2)
        System.out.println(arr[0].length); // 첫 번째 행의 열의 길이 (3)

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
