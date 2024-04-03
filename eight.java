import java.util.Arrays;

public class eight {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 4, 5, 6, 7};


        // Sort both arrays to optimize the common elements finding process
        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0, j = 0;
        System.out.print("Common elements: ");
        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                System.out.print(array1[i] + " ");
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            }
            else{j++;}}System.out.println();
    }
}
