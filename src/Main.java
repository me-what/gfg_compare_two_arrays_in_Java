import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 1, 2, 3 };

        if (arr1 == arr2)
            System.out.println("Same");
        else
            System.out.println("Not same");
// not same


        int array1[] = { 1, 2, 3 };
        int array2[] = { 1, 2, 3 };

        if (Arrays.equals(array1, array2))
            System.out.println("Same");
        else
            System.out.println("Not same");
// Same


        int inarr1[] = { 1, 2, 3 };
        int inarr2[] = { 1, 2, 3 };

        Object[] arra1 = { inarr1 };
        Object[] arra2 = { inarr2 };

        if (Arrays.equals(arra1, arra2))
            System.out.println("Same");
        else
            System.out.println("Not same");
// Not same


        int inarra1[] = { 1, 2, 3 };
        int inarra2[] = { 1, 2, 3 };

        Object[] array_1 = { inarra1 };
        Object[] array_2 = { inarra2 };

        if (Arrays.deepEquals(array_1, array_2))
            System.out.println("Same");
        else
            System.out.println("Not same");
// Same


        int inarray_1[] = { 1, 2, 3 };
        int inarray_2[] = { 1, 2, 3 };

        Object[] arrays_1 = { inarray_1 };
        Object[] arrays_2 = { inarray_2 };

        Object[] outarr1 = { arrays_1 };
        Object[] outarr2 = { arrays_2 };

        if (Arrays.deepEquals(outarr1, outarr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
// Same
    }
}