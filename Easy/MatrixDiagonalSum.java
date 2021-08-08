package Easy;

public class MatrixDiagonalSum {
    /*  Given a square matrix mat, return the sum of the matrix diagonals.
    Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal   that are not part of the primary diagonal.

    Example 1:
    Input: mat = [[1,2,3],
                  [4,5,6],
                  [7,8,9]]
    Output: 25
    Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
    Notice that element mat[1][1] = 5 is counted only once.

    */

    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        int sum = 0;

        for(int i=0,j= mat.length-1; i< mat.length; i++,j--)
        {
            if(i != j)
            {
                sum += mat[i][i] + mat[j][i];
            }

            else
            {
                sum += mat[i][j];
            }
        }

        System.out.println("Output: " +sum);
    }
}
