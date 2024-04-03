public class four {

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[][] rows = new int[mat.length][2]; // 2D array to store soldier count and row index

        // Step 1: Calculate the number of soldiers in each row and store row indices
        for (int i = 0; i < mat.length; i++) {
            rows[i][0] = countSoldiers(mat[i]); // Store soldier count
            rows[i][1] = i; // Store row index
        }

        // Step 2: Sort the array of rows based on the number of soldiers
        sortRows(rows);

        // Step 3: Extract the indices of the k weakest rows
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rows[i][1]; // Get the row index from the sorted array
        }

        return result;
    }

    // Helper method to count soldiers in a row
    private static int countSoldiers(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) count++;
            else break; // All 1's are to the left, so we can stop counting on the first 0
        }
        return count;
    }

    // Helper method to sort the array of rows based on the number of soldiers
    private static void sortRows(int[][] rows) {
        // Bubble sort
        int n = rows.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (rows[j][0] > rows[j + 1][0] || (rows[j][0] == rows[j + 1][0] && rows[j][1] > rows[j + 1][1])) {
                    // Swap rows if soldier counts are different or if counts are equal, but row indices are greater
                    int[] temp = rows[j];
                    rows[j] = rows[j + 1];
                    rows[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 5;
        int[] weakestRows = kWeakestRows(mat, k);
        for (int idx : weakestRows) {
            System.out.print(idx + " ");
        }
        // Expected output: 2 0 3
    }
}
