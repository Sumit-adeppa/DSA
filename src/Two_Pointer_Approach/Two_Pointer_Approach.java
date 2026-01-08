package Two_Pointer_Approach;

public class Two_Pointer_Approach {
    public static void main(String[] args) {

        int[] arr = {5, 3, 7, 1, 2, 9, 4, 8};
        int key = 4;

        boolean found = false;

        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Iteration number " + i);
            if (arr[i] == key || arr[j] == key) {
                System.out.println("Element found");
                found = true;
                break;
            }
            j--;
        }

        if (!found) {
            System.out.println("Element not found");
        }

    }
}
